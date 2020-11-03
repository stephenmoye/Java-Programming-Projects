// A bank charges a base fee of $10 per month, plus the following check fees for a commercial
// checking account:
// $.10 each for less than 20 checks
// $.08 each for 20–39 checks
// $.06 each for 40–59 checks
// $.04 each for 60 or more checks
// Write a program that asks for the number of checks written for the month. The program
// should then calculate and display the bank’s service fees for the month.

import java.util.Scanner;

public class BankCharges {
  public static void main(String[] args) {
    int checks;
    double total, fees = 0.00;
    Scanner input = new Scanner(System.in);

    System.out.print("How many checks did you use this month? ");
    checks = input.nextInt();

    if (checks > 0 && checks < 20) {
      fees = checks * 0.10;
    } else if (checks >= 20 && checks <= 39) {
      fees = checks * 0.08;
    } else if (checks >= 40 && checks <= 59) {
      fees = checks * 0.06;
    } else if (checks >= 60) {
      fees = checks * 0.04;
    }
   
    total = fees + 10;

    System.out.println("Check fees: $" + fees);
    System.out.println("Total bank service fee1: $" + total);

    input.close();
  }
}
