
package edu.buffalostate.cis425.sp24.mahmuds02;

/** File: Temperature.java
 *
 * Requirements:
 *
 *   1) Add two new methods: 
 *        incrementTemp() 
 *        decrementTemp() 
 *      that increment and decrement the current temperature value 
 *      by one degree respectively 
 *   2) Add a method: 
 *        changeTemp( double t ) that adds t to the current temperature 
 *   3) Add a main() method to this class 
 *   4) In the main method: 
 *      create two instances of the Temperature 
 *      object each with a different temperature 
 *   5) Call the getTemp() method in each of the temperature objects 
 *      and print a message with the result to the users screen (Console) 
 *   6) Call the incrementTemp(), decrementTemp() and changeTemp(t)
 *      methods several times from the main() 
 *      (use getTemp() to see if the temperature did change)
 * Remember that there should not be any print statements in the 
 * Temperature class - The print statements display the temperature 
 * changes should be in the main() method.
 * 
 * Description: This class stores the current temperature.  
 * It contains access methods to set and get the temperature.
 *
 */ 
/**
 *
 * @author Saim Mahmud
 *
 */

 public class Temperature
 {
     private double currentTemp;
 
  /** * setTemp() sets the temperature to the given value
   * @param t -- the given value
  */
     public void setTemp(double t)
     {
         currentTemp = t;
     }
 
  /**
   *
   * getTemp() returns the current temperature
   *
   */ 
     public double getTemp()
     {
         return currentTemp;
     }
 
  /**
   * incrementTemp() returns the (new) current temperature
   */
     /* put code here */
   public void incrementTemp(){
    currentTemp+=1;
   }
  /*
   *
   * decrementTemp() returns the (new) current temperature
   *
   */
     /* put code here */
    public void decrementTemp(){
    currentTemp-=1;

    }
  /*
   *
   * changeTemp( double t ) adds t to current temperature and
   * then returns the (new) temperature
   *
   */
     /* put code here */
     public void changeTemp(double t){
     currentTemp+= t;
     }


public static void main(String[] args) {
  //create two instances of the Temperature 
// object each with a different temperature  

Temperature temp1 = new Temperature();
temp1.setTemp(35.0);

Temperature temp2 = new Temperature();
temp2.setTemp(25.0);


// printing initial tempretaures
System.out.println("Initial Temperature 1: " + temp1.getTemp() + "degrees");
System.out.println("Initial Temperature 2:  " + temp2.getTemp() + "degrees");

// incrementTemp(), decrementTemp() and changeTemp(t


temp1.incrementTemp();
System.out.println("After incrementing, Temperature 1: " + temp1.getTemp() + " degrees");

temp2.decrementTemp();
System.out.println("After decrementing, Temperature 2: " + temp2.getTemp() + " degrees");

temp1.changeTemp(4.5);
System.out.println("After changing, Temperature 1: " + temp1.getTemp() + " degrees");

temp2.changeTemp(-5.5);
System.out.println("After changing, Temperature 2: " + temp2.getTemp() + " degrees");
}


 } // Temperature

