# SWE2313 Assignment 1

Install it and run it.  Assumes you have a modern version of node installed.

```shell
$ npm install
$ node app.js
Give me a number (or `done` if finished): 1
Give me a number (or `done` if finished): 2
Give me a number (or `done` if finished): 3
Give me a number (or `done` if finished): 4
Give me a number (or `done` if finished): done
The mean average of your numbers is 2.5
```

It has unit tests too!

```shell
$ npm test

> assignment1@0.1.0 test /Users/jyoung/dev/random-college-course-assignments/swe2313/assignment1
> mocha --reporter spec test/mocha/*.js

|

  The average library
    addNumber method
      ✓ is expected to return `true` with an integer as an argument
      ✓ is expected to return `true` with a decimal as an argument
      ✓ is expected to return `false` with a string as an argument
      ✓ is expected to return `false` with no argument
    getAverage method
      ✓ is expected to return the average of a collection of integers
      ✓ is expected to return the average of a collection of decimals
      ✓ is expected to ignore invalid data and return the average of the valid data
      ✓ is expected to return `false` if given a complete set of invalid data


  8 passing (8ms)
```
