// An Internet service provider has three different subscription packages for its customers:
// Package A: For $9.95 per month 10 hours of access are provided. Additional hours
// are $2.00 per hour.
// Package B: For $13.95 per month 20 hours of access are provided. Additional hours
// are $1.00 per hour.
// Package C: For $19.95 per month unlimited access is provided.
// Write a program that calculates a customer’s monthly bill. It should ask the user to enter
// the letter of the package the customer has purchased (A, B, or C) and the number of hours
// that were used. It should then display the total charges.

import java.util.Scanner;

public class ISP {
  public static void main(String[] args) {
    String plan;
    Double hours, total = 0.00, price = 0.00;
    Scanner input = new Scanner(System.in);

    System.out.print("Which package letter do you have? ");
    plan = input.next();

    System.out.print("How many hours did you use this month? ");
    hours = input.nextDouble();

    if (plan.equals("A") || plan.equals("a")) {
      price = 9.95;
      total = (hours * 2) + price;
    } else if (plan.equals("B") || plan.equals("b")) {
      price = 13.95;
      total = (hours * 1) + price;
    } else if (plan.equals("C") || plan.equals("c")) {
      price = 19.95;
      total = price;
    } else {
      System.out.print("Please enter a valid package. ");
    }

    // Do not provide a total if an invalid package name is provided
    if (total > 0) {
      System.out.println("Your total charges are $" + total);
    }

    input.close();
  }
}
