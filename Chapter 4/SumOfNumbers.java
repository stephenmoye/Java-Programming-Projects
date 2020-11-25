// Sum of Numbers
// Write a program that asks the user for a positive nonzero integer value. The program should
// use a loop to get the sum of all the integers from 1 up to the number entered. For example,
// if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50.

import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    int num, sum = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a positive number. ");
    num = input.nextInt();

    if (num > 0) {
      for (int i = 1; i <= num; i++) {
        sum += i;
      }
    }
    System.out.println(sum);

  }
}
