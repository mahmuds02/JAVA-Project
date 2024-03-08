package edu.buffalostate.cis425.sp24.mahmuds02;

/**
 * File: Triangle.java
 *
 * Create a Java class named Triangle that represents a "triangle"
 * with the following characteristics:
 *
 * 1) The class has three private integer instance variables
 *    (S1, S2, S3) to store the sides of the triangle.
 * 2) This class has two constructors:
 *    Constructor #1 - has no parameters and initializes the
 *    triangle's sides to 0
 *    Constructor #2 - has three integer parameters that
 *    initializes the triangle's sides
 * 3) This class has a method calculatePerimeter() which
 *    returns the perimeter (s1+s2+s3) of the triangle as an
 *    integer
 * 4) This class contains a main() method which creates an
 *    instance of the triangle object with
 *    S1=10, S2=5, S3=2 and computes the object's perimeter
 *    (via calculatePerimeter) and outputs the result to the
 *    user's screen.
 *
 */
/**
 *
 * @author Saim Mahmud
 *
 */
public class Triangle {

    // Private instance variables to hold the sides of the triangle
    private int S1, S2, S3;

    // Constructor #1:  initializes the sides to 0
    public Triangle() {
        this.S1 = 0; // Initialize side 1 to 0
        this.S2 = 0; // Initialize side 2 to 0
        this.S3 = 0; // Initialize side 3 to 0
    }

    // Constructor #2: Constructor with parameters to initialize the sides
    public Triangle(int s1, int s2, int s3) {
        this.S1 = s1; // Set side 1 to the value of s1
        this.S2 = s2; // Set side 2 to the value of s2
        this.S3 = s3; // Set side 3 to the value of s3
    }

    // Method to calculate and return the perimeter of the triangle
    public int calculatePerimeter() {
        return S1 + S2 + S3; // Return the sum of all sides as the perimeter
    }

    // Main method to run the program
    public static void main(String args[]) {
        // Create an instance of Triangle with sides 10, 5, and 2
        Triangle t = new Triangle(10, 5, 2);
        
        // Output the perimeter of the created triangle
        System.out.println("The perimeter of t is: " + t.calculatePerimeter());
    }
}
