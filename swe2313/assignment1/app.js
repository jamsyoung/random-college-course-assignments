'use strict';

var
    Average = require('./lib/average'),
    average,
    readline = require('readline'),
    rl;

average = new Average();

rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});


function askQuestion() {
    rl.question('Give me a number (or `done` if finished): ', function (response) {
        var computedAverage;

        if (!average.addNumber(response)) {
            console.log('I asked for a NUMBER!!');
            console.log();
        }

        if (average.isComplete()) {
            computedAverage = average.getAverage();

            if (computedAverage) {
                console.log('The mean average of your numbers is %d', average.getAverage());
            } else {
                console.log('No valid numbers to average!');
            }

            process.exit(0);
        } else {
            askQuestion();
        }
    });
}

askQuestion();
