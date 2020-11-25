// Budget Analysis
// Write a program that asks the user to enter the amount that he or she has budgeted for
// a month. A loop should then prompt the user to enter each of his or her expenses for the
// month, and keep a running total. When the loop finishes, the program should display the
// amount that the user is over or under budget.

import java.util.Scanner;

public class BudgetAnalysis {
  public static void main(String[] args) {
    double budget, total = 0;
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is your budget? ");
    budget = input.nextDouble();

    while (total < budget) {
      System.out.print("Expenses for today: ");
      total += input.nextDouble();
    }
    
    System.out.println("Budget: " + budget);
    System.out.println("Total: " + total);
    System.out.println("You went over budget by $" + (total - budget));
    
    input.close();
  }
}