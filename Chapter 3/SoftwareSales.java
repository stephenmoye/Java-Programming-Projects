// A software company sells a package that retails for $99. Quantity discounts are given
// according to the following table:
// Quantity Discount
// 10–19 20%
// 20–49 30%
// 50–99 40%
// 100 or more 50%
// Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the
// purchase after the discount.

import java.util.Scanner;

public class SoftwareSales {
  public static void main(String[] args) {
    double PACKAGE, quantity, discount = 0, total;
    Scanner input = new Scanner(System.in);

    System.out.print("How many packages did you purchase? ");
    quantity = input.nextDouble();

    if (quantity > 10 && quantity < 20) {
      discount = .20;
    } else if (quantity > 20 && quantity < 50) {
      discount = .30;
    } else if (quantity > 50 && quantity < 100) {
      discount = .40;
    } else if (quantity > 1000) {
      discount = .50;
    }
    PACKAGE = 99;
    total = discount * PACKAGE;
    System.out.println("Shipping charge: $" + total );

    input.close();
  }

}
