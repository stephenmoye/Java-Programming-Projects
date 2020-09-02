// 10. Test Average
// Write a program that asks the user to enter three test scores. 
// The program should display each test score, as well as the average of the scores.

import javax.swing.JOptionPane;

public class TestAverage {
  public static void main(String[] args) {
    String test1 = JOptionPane.showInputDialog("First test score");
    String test2 = JOptionPane.showInputDialog("Second test score");
    String test3 = JOptionPane.showInputDialog("Third test score");

    int score1 = Integer.parseInt(test1);
    int score2 = Integer.parseInt(test2);
    int score3 = Integer.parseInt(test3);

    int average = (score1 + score2 + score3) / 3;

    System.out.println("First test score: " + score1);
    System.out.println("Second test score: " + score2);
    System.out.println("Third test score: " + score3);
    System.out.println("Overall test average: " + average);

  }
}