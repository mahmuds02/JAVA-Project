package edu.buffalostate.cis425.sp24.mahmuds02;

/**
 * File: TaxWhiz.java
 *
 * Description: This class stores a tax rate and
 * computes the tax for a given purchase price.
 *
 * Requirements:
 *
 *  1) Add a method changeTax() that changes the current tax
 *     rate by the amount in the parameter
 *  2) Add a main method
 *  3) In the main, create two instances of TaxWhiz with a tax
 *     rates of 8.75 and 4.75 percent
 *  4) Compute the tax on two different purchases (one at the * 8.75 rate
 *     and one at the 4.75 rate)
 *  5) Print the total of two purchases, the total tax and the
 *     total amount (purchases + tax)
 *  6) Repeat steps 4) and 5) but first increment the tax rate by 1.0
 *     percentage point
 *
 * @author: Saim Mahmud
 *
 */
public class TaxWhiz {
    private double taxRate;

    public TaxWhiz(double t) {
        taxRate = t / 100; // Store as a percentage
    }

    public double calcTax(double purchase) {
        return purchase * taxRate;
    }

    public void changeTax(double t) {
        taxRate += t / 100; // Adjust tax rate by percentage point
    }

    // Method to print detailed receipt
    private static void printReceipt(String title, double purchase1, double tax1, double purchase2, double tax2) {
        System.out.println(title);
        System.out.printf("Item 1: Purchase = $%.2f, Tax = $%.2f, Total = $%.2f\n", purchase1, tax1, purchase1 + tax1);
        System.out.printf("Item 2: Purchase = $%.2f, Tax = $%.2f, Total = $%.2f\n", purchase2, tax2, purchase2 + tax2);
        double totalPurchase = purchase1 + purchase2;
        double totalTax = tax1 + tax2;
        System.out.printf("Total Purchase = $%.2f, Total Tax = $%.2f, Grand Total = $%.2f\n\n", totalPurchase, totalTax, totalPurchase + totalTax);
    }


    // fill in code to setup the purchases, create the
    // objects, calculate the tax, print the receipt
    // then change the tax rate and calculate and print
    // out new receipt
    public static void main(String[] args) {
        // Initial purchases
        double purchase1 = 800.0;
        double purchase2 = 500.0;

        // TaxWhiz objects with initial tax rates
        TaxWhiz tax1 = new TaxWhiz(8.75);
        TaxWhiz tax2 = new TaxWhiz(4.75);

        // Calculating taxes for both purchases
        double taxForPurchase1 = tax1.calcTax(purchase1);
        double taxForPurchase2 = tax2.calcTax(purchase2);

        // Printing initial receipt
        printReceipt("Receipt Before Tax Change:", purchase1, taxForPurchase1, purchase2, taxForPurchase2);

        // Changing the tax rates
        tax1.changeTax(1.0); // Increment by 1 percentage point
        tax2.changeTax(1.0); // Increment by 1 percentage point

        // Calculating new taxes after rate change
        double newTaxForPurchase1 = tax1.calcTax(purchase1);
        double newTaxForPurchase2 = tax2.calcTax(purchase2);

        // Printing receipt after tax rate change
        printReceipt("Receipt After Tax Change:", purchase1, newTaxForPurchase1, purchase2, newTaxForPurchase2);
    }
}
