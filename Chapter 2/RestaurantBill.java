// 13. Restaurant Bill
// Write a program that computes the tax and tip on a restaurant bill. The program should ask
// the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
// The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
// amount, tip amount, and total bill on the screen.

import javax.swing.JOptionPane;

public class RestaurantBill {
  public static void main(String[] args) {
    String bill;
    double price;
    double tax;
    double tip;
    double total;

    bill = JOptionPane.showInputDialog("How much was your bill?");

    price = Double.parseDouble(bill);
    tax = price * 0.0675;
    tip = (price + tax) * 0.2;
    total = price + tip + tax;

    System.out.println("Bill amount: $" + bill);
    System.out.println("Taxes: $" + tax);
    System.out.println("Amount tipped: $" + tip);
    System.out.println("Grand Total: $" + total);

  }
}