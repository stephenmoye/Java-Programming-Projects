// 13. Restaurant Bill
// Write a program that computes the tax and tip on a restaurant bill. The program should ask
// the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
// The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
// amount, tip amount, and total bill on the screen.

import java.util.Scanner;

public class RestaurantBill {
  public static void main(String[] args) {
    double price;
    double tax;
    double tip;
    double total;

    Scanner input = new Scanner(System.in);

    System.out.print("How much was your bill?");
    price = input.nextDouble();

    tax = price * 0.0675;
    tip = (price + tax) * 0.2;
    total = price + tip + tax;

    System.out.println("Bill amount: $" + price);
    System.out.println("Taxes: $" + tax);
    System.out.println("Amount tipped: $" + tip);
    System.out.println("Grand Total: $" + total);

    input.close();

  }
}