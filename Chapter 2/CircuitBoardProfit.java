// 11. Circuit Board Profit
// An electronics company sells circuit boards at a 40 percent profit. If you know the retail
// price of a circuit board, you can calculate its profit with the following formula:
// Profit = Retail price × 0.4
// Write a program that asks the user for the retail price of a circuit board, calculates the
// amount of profit earned for that product, and displays the results on the screen.

import javax.swing.JOptionPane;

public class CircuitBoardProfit {
  public static void main(String[] args) {
    String boardPrice = JOptionPane.showInputDialog("What is the price of the circuit board? ");

    double retailPrice = Double.parseDouble(boardPrice);
    double profit = retailPrice * 0.4;

    System.out.print("Profit earned on circuit board: $" + profit);
  }
}