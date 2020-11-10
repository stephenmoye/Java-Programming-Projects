// Average Rainfall
// Write a program that uses nested loops to collect data and calculate the average rainfall
// over a period of years. First the program should ask for the number of years. The outer loop
// will iterate once for each year. The inner loop will iterate 12 times, once for each month.
// Each iteration of the inner loop will ask the user for the inches of rainfall for that month.
// After all iterations, the program should display the number of months, the total inches of
// rainfall, and the average rainfall per month for the entire period.
// Input Validation: Do not accept a number less than 1 for the number of years. Do not
// accept negative numbers for the monthly rainfall.

import java.util.Scanner;

public class AverageRainfall {
  public static void main(String[] args) {
    int years;
    double monthRain;
    Scanner input = new Scanner(System.in);

    System.out.print("Over how many years did the rainfall occur? ");
    years = input.nextInt();
    
    for(int y = 0; y < years; y++) {
      for(int m = 0; m < 12; m++) {
        double totalRain;
        System.out.print("How much did it rain in month," + m + "? ");
        monthRain = input.nextDouble();
        totalRain += monthRain;
      }
      System.out.print("It rained " + totalRain + " inches in" + years * 12 + " months.");
    }
      input.close();
  }
}
