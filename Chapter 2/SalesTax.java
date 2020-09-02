// 7. Sales Tax
// Write a program that will ask the user to enter the amount of a purchase. The program
// should then compute the state and county sales tax. Assume the state sales tax is 4 percent
// and the county sales tax is 2 percent. The program should display the amount of the purchase, 
// the state sales tax, the county sales tax, the total sales tax, and the total of the sale
// (which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value
// 0.02 to represent 2 percent, and 0.04 to represent 4 percent.

import javax.swing.JOptionPane;

public class SalesTax {
  public static void main(String[] args) {
    String purchase;
    double price;
    double stateTax;
    double countyTax;
    double grandTotal;

    purchase = JOptionPane.showInputDialog("How much was your purchase?");

    price = Double.parseDouble(purchase);
    stateTax = price * 0.04;
    countyTax = price * 0.02;
    grandTotal = price + stateTax + countyTax;

    System.out.println("Purchase price: " + purchase);
    System.out.println("State tax: " + stateTax);
    System.out.println("County tax: " + countyTax);
    System.out.println("Total tax: " + (stateTax + countyTax));
    System.out.println("Grand Total: " + grandTotal);

  }
}