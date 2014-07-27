/* jshint mocha: true */
'use strict';

var
    Average = require('../../lib/average.js'),
    average,
    chai = require('chai'),
    expect = chai.expect;


describe('The average library', function () {
    beforeEach(function () {
        average = new Average();
    });

    afterEach(function () {
        average = null;
    });

    describe('addNumber method', function () {
        it('is expected to return `true` with an integer as an argument', function () {
            expect(average.addNumber(1)).to.equal(true);
        });

        it('is expected to return `true` with a decimal as an argument', function () {
            expect(average.addNumber(1.23)).to.equal(true);
        });

        it('is expected to return `false` with a string as an argument', function () {
            expect(average.addNumber('I am not a number')).to.equal(false);
        });

        it('is expected to return `false` with no argument', function () {
            expect(average.addNumber()).to.equal(false);
        });
    });

    describe('getAverage method', function () {
        it('is expected to return the average of a collection of integers', function () {
            average.addNumber(1);
            average.addNumber(2);
            average.addNumber(3);
            expect(average.getAverage()).to.equal(2);
        });

        it('is expected to return the average of a collection of decimals', function () {
            average.addNumber(1.1);
            average.addNumber(2.2);
            average.addNumber(3.3);
            expect(average.getAverage()).to.equal(2.2);
        });

        it('is expected to ignore invalid data and return the average of the valid data', function () {
            average.addNumber(1);
            average.addNumber(2);
            average.addNumber(3);
            average.addNumber('I am not a number');
            expect(average.getAverage()).to.equal(2);
        });

        it('is expected to return `false` if given a complete set of invalid data', function () {
            average.addNumber('I am not a number');
            average.addNumber('1.1.');
            average.addNumber('.1.');
            average.addNumber('0.1.1');
            expect(average.getAverage()).to.equal(false);
        });
    });
});

