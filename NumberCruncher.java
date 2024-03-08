package edu.buffalostate.cis425.sp24.mahmuds02;

/**
 * File: NumberCruncher.java
 *
 * Description: This class stores a number and contains
 * methods to calculate the number's double, triple, and so on.
 *
 * Assignment:
 *     1) add a new method cubeNumber() that returns the number^3
 *        power (num*num*num)
 *     2) add a new method sixthNumber() that returns the number^6
 *        power, but it can use only one multiplication in the
 *        method (can't use num*num*num*num*num*num).
 *        Hint: use the other methods that are available - and do not use the
 *        Math.pow() function
 *     3) Test cubeNumber() and sixthNumber() in the main method
 */

public class NumberCruncher {
    private double num; // The instance variable

    public NumberCruncher(double number) {
        num = number;
    }

    public double getNum() {
        return num;
    }

    public double doubleNum() {
        return num * 2;
    }

    public double tripleNum() {
        return num * 3;
    }

    public double squareNum() {
        return num * num;
    }

    // Method to cube the number
    public double cubeNumber() {
        return num * num * num;
    }

    // Method to find the sixth power of the number using one multiplication
    public double sixthNumber() {
        // Utilizing the cubeNumber() method to calculate the cube and then squaring the result
        // to get the sixth power using only one multiplication operation.
        double cube = cubeNumber();
        return cube * cube;
    }

    public static void main(String args[]) {
        NumberCruncher cruncher1 = new NumberCruncher(2); // Changed to 2 for more illustrative output
        System.out.println("Value of num is " + cruncher1.getNum());
        System.out.println("num doubled is " + cruncher1.doubleNum());
        System.out.println("num tripled is " + cruncher1.tripleNum());
        System.out.println("num squared is " + cruncher1.squareNum());
        // Testing the new methods
        System.out.println("num cubed is " + cruncher1.cubeNumber());
        System.out.println("num to the sixth power is " + cruncher1.sixthNumber());
    } // main()
} // NumberCruncher
