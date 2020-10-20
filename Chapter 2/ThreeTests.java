// 10. Test Average
// Write a program that asks the user to enter three test scores. 
// The program should display each test score, as well as the average of the scores.

import java.util.Scanner;

public class ThreeTests {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("1st score: ");
    int test1 = input.nextInt();
    System.out.print("2nd score: ");
    int test2 = input.nextInt();
    System.out.print("3rd score: ");
    int test3 = input.nextInt();

    int average = (test1 + test2 + test3) / 3;

    System.out.println("Test average: " + average);

  }
}