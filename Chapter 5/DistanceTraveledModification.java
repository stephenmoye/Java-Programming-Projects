
// 9. Distance Traveled Modification
// The distance a vehicle travels can be calculated as follows:
// Distance 5 Speed * Time
// Write a method named distance that accepts a vehicle’s speed and time as arguments, and
// returns the distance the vehicle has traveled. Modify the “Distance Traveled” program you
// wrote in Chapter 4 (Programming Challenge 2) to use the method.
import java.util.Scanner;

public class DistanceTraveledModification {
  public static void main(String[] args) {
    distance();
  }

  public static void distance() {
    int speed, hour;

    Scanner input = new Scanner(System.in);

    System.out.print("What is the speed of your vehicle (in MPH)? ");
    speed = input.nextInt();

    System.out.print("How many hours did you travel for? ");
    hour = input.nextInt();

    input.close();

    distData(speed, hour);
  }

  public static void distData(int speed, int hour) {

    System.out.println("time (hours)" + "       " + "distance traveled (miles)");
    System.out.println("---------------------------");
    if (hour > 0 && speed > 0) {
      for (int i = 1; i <= hour; i++) {
        System.out.println(i + "                  " + speed * i);
      }
    } else {
      System.out.print("Negative values are not accepted. Please enter a positive value.");
    }

  }
}
