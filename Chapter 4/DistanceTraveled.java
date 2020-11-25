// Distance Traveled
// The distance a vehicle travels can be calculated as follows:
// Distance = Speed * Time
// For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
// 120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the
// number of hours it has traveled. It should use a loop to display the distance a vehicle has
// traveled for each hour of a time period specified by the user. For example, if a vehicle is
// traveling at 40 mph for a three-hour time period, it should display a report similar to the
// one that follows:
// Input Validation: Do not accept a negative number for speed and do not accept any value
// less than 1 for time traveled.

import java.util.Scanner;

public class DistanceTraveled {
  public static void main(String[] args) {
    int speed, hour;

    Scanner input = new Scanner(System.in);

    System.out.print("What is the speed of your vehicle (in MPH)? ");
    speed = input.nextInt();

    System.out.print("How many hours did you travel for? ");
    hour = input.nextInt();

    System.out.println("time (hours)" + "       " + "distance traveled (miles)");
    System.out.println("---------------------------");
    if (hour > 0 && speed > 0) {
      for (int i = 1; i <= hour; i++) {
        System.out.println(i + "                  " + speed * i);
      }
    } else {
      System.out.print("Negative values are not accepted. Please enter a positive value.");
    }

    input.close();
  }
}
