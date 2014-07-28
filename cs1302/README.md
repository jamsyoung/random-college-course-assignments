# CS1302
I am not actually taking this class, but I have friends who are.  We like to
race on some of the assignments to see who can finish first. 


## How to compile on command line
Assuming you have java installed.

```
$ javac *.java
```


## How to run on command line

```
$ java [class-name]
```


## Example
This is from assignment 1.

```
$ l
-rw-rw-r--  1 jayoung  staff  1068 Sep  6 01:24 CashRegister.java
-rw-rw-r--  1 jayoung  staff  1203 Sep  6 01:32 Checkout.java

$ javac *.java

$ l
-rw-rw-r--  1 jayoung  staff  1520 Sep  6 01:36 CashRegister.class
-rw-rw-r--  1 jayoung  staff  1068 Sep  6 01:24 CashRegister.java
-rw-rw-r--  1 jayoung  staff  1427 Sep  6 01:36 Checkout.class
-rw-rw-r--  1 jayoung  staff  1203 Sep  6 01:32 Checkout.java

$ java Checkout
Setting Tax Rate to 0.06%

Adding item price: $1.23
Adding item price: $5.93
Adding item price: $21.34

   Subtotal: $28.50
        Tax: $1.71
Grand Total: $30.21

Recalculating with new tax rate ...

Setting Tax Rate to 0.08%
   Subtotal: $28.50
        Tax: $2.28
Grand Total: $30.78
```


## How to generate documentation with javadoc
Assuming you have javadoc installed.

```
$ cd assignment1/docs
$ javadoc ../CashRegister.java
```


## How to browse the generated docs
Assuming you are using OS X

```
$ open assignment1/docs/index.html
```


## How to run JUnit tests
Again, assuming you are using OS X

```
$ ./runJUnitTests.sh
```

This is doing two things, which you can do manually if you want.  It builds the
CashRegisterTest class and then executes it.

```
$ javac -cp .:/usr/share/java/junit.jar CashRegisterTest.java
$ java  -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore CashRegisterTest
JUnit version 4.10
.Default constructor should set tax rate to 0.08
.Passing double into constructor should set tax rate
.Should be able to set tax rate after cash regsiter is created

Time: 0.006

OK (3 tests)
```
