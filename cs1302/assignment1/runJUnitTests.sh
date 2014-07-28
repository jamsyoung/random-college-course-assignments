#!/bin/bash

javac -cp .:/usr/share/java/junit.jar CashRegisterTest.java
java  -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore CashRegisterTest
