// Largest and Smallest
// Write a program with a loop that lets the user enter a series of integers. 
// The user should enter −99 to signal the end of the series. 
// After all the numbers have been entered, the program should 
// display the largest and smallest numbers entered.

import java.util.Scanner;

public class LargestAndSmallest {
  public static void main(String[] args) {
    int num, smallest, largest;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number. -99 will end the program.");
    System.out.print("Please enter a number: ");
    num = input.nextInt();
    smallest = num;
    largest = num;

    while (num != -99) {
      System.out.print("Please enter a number: ");
      num = input.nextInt();
      if (num == -99) {
        break;
      } else if (num < smallest) {
        smallest = num;
      } else if (num > largest) {
        largest = num;
      }
    }
    System.out.println("Smallest: " + smallest);
    System.out.print("Largest: " + largest);

    input.close();
  }
}
