// 10. Test Average
// Write a program that asks the user to enter three test scores. 
// The program should display each test score, as well as the average of the scores.

import java.util.Scanner;

public class TestAverage {
  public static void main(String[] args) {
    int test1;
    int test2;
    int test3;

    Scanner input = new Scanner(System.in);

    System.out.print("First test score: ");
    test1 = input.nextInt();
    System.out.print("Second test score: ");
    test2 = input.nextInt();
    System.out.print("Third test score: ");
    test3 = input.nextInt();

    int average = (test1 + test2 + test3) / 3;

    System.out.println("Overall test average: " + average);

    input.close();

  }
}