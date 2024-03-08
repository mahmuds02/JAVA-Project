package edu.buffalostate.cis425.sp24.mahmuds02;
import java.io.IOException;
import java.util.Scanner;
public class Cube {
    //class variables and objects
    private int length;

    // Constructor
    public Cube(int length) {
        this.length=length;
    }

    // Create the getLength() method to accept input
    public int getLength(){
        return this.length;
    }

    // Create the calculateSurfaceArea() method
    public int calculateSurfaceArea() {
        return 6*this.length*this.length;
    }

    //Create the calculateVolume() method
    public int calculateVolume(){
        return this.length*this.length*this.length;
    }


    //
    //main() -- creates 3 instances of Cube and calculates the surface area and volume

    public static void main(String args []) throws IOException{
        Scanner scanner = new Scanner(System.in);

    //Requirements:
        //    1) Create 3 cube objects. The size of each of the cubes
        //       should be input from the keyboard

     for (int i=1; i<=3; i++){
         System.out.println("Enter the side length for cube " + i + ":");
         while (!scanner.hasNextInt()) {
             System.out.println("Invalid input. Please enter a numeric value. ");
             scanner.next();
         }

     int length =scanner.nextInt();
         // greater than zero
      if (length <=0){
          System.out.println("The side length must be greater than 0");
          return;
      }

   //2) Print the Side length, Surface area and Volume to the
         // *      user's screen (console) for each of the cubes


      Cube cube = new Cube(length);

      System.out.println("Cube " + 1 + ":");
      System.out.println("Side Length: " + cube.getLength());
      System.out.println("Surface Area: " + cube.calculateSurfaceArea());
      System.out.println("Volume: " + cube.calculateVolume());
      System.out.println();





     }
    scanner.close();
    }



















}
