'use strict';

function Average() {
    var
        complete = false,
        numbers = [];

    this.getAverage = function () {
        var
            response = false,
            sum;

        if (numbers.length > 0) {
            sum = numbers.map(function (number) {
                return number * 100;
            }).reduce(function (previousValue, currentValue) {
                return previousValue + (currentValue || 0);
            });

            response = Math.round((sum/numbers.length))/100;
        }

        return response;
    };

    this.addNumber = function (data) {
        var
            number,
            response = true;

        if (data === 'done') {
            complete = true;
        } else {
            complete = false;

            number = +data;

            if (!isNaN(number)) {
                numbers.push(number);
            } else {
                response = false;
            }
        }

        return response;
    };

    this.isComplete = function () {
        return complete;
    };
}

module.exports = Average;
