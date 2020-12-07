// Write a program that asks the user to enter a distance in meters. The program will then present the following menu of selections:
// 1. Convert to kilometers
// 2. Convert to inches
// 3. Convert to feet
// 4. Quit the program
// The program will convert the distance to kilometers, inches, or feet, depending on the user’s
// selection. Here are the specific requirements:
// •	 Write a void method named showKilometers, which accepts the number of meters as
// an argument. The method should display the argument converted to kilometers. Convert the meters to kilometers using the following formula:
// kilometers = meters * 0.001
// •	 Write a void method named showInches, which accepts the number of meters as an
// argument. The method should display the argument converted to inches. Convert the
// meters to inches using the following formula:
// inches = meters * 39.37
// •	 Write a void method named showFeet, which accepts the number of meters as an
// argument. The method should display the argument converted to feet. Convert the
// meters to feet using the following formula:
// feet = meters * 3.281
// •	 Write a void method named menu that displays the menu of selections. This method
// should not accept any arguments.
// •	 The program should continue to display the menu until the user enters 4 to quit the
// program.
// •	 The program should not accept negative numbers for the distance in meters.
// •	 If the user selects an invalid choice from the menu, the program should display an
// error message.
// Here is an example session with the program, using console input. The user’s input is shown
// in bold.
// Enter a distance in meters: 500 [Enter]
// 1. Convert to kilometers
// 2. Convert to inches
// 3. Convert to feet
// 4. Quit the program
// Enter your choice: 1 [Enter]
// 500 meters is 0.5 kilometers.
// 1. Convert to kilometers
// 2. Convert to inches
// 3. Convert to feet
// 4. Quit the program
// Enter your choice: 3 [Enter]
// 500 meters is 1640.5 feet.
// 1. Convert to kilometers
// 2. Convert to inches
// 3. Convert to feet
// 4. Quit the program
// Enter your choice: 4 [Enter]
// Bye!

import java.util.Scanner;

public class ConversionProgram {

  public static void main(String[] args) {
    int meters = distance();
    menuOptions(meters);

  }

  public static int distance() {
    int meters;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a distance in meters: ");
    meters = input.nextInt();

    return meters;
  }

  public static void menuOptions(int meters) {
    int choice;
    Scanner input = new Scanner(System.in);

    System.out.println("1. Convert to kilometers");
    System.out.println("2. Convert to inches");
    System.out.println("3. Convert to feet");
    System.out.println("4. Quit the program");
    System.out.print("Enter your choice: ");
    choice = input.nextInt();

    if (choice == 1) {
      showKilometers(meters);
    } else if (choice == 2) {
      showInches(meters);
    } else if (choice == 3) {
      showFeet(meters);
    } else {
      quit();
    }
  }

  public static void showKilometers(int meters) {
    double kilometers = meters * 0.001;

    System.out.println(meters + " meters is " + kilometers + " kilometers.");
    menuOptions(meters);
  }

  public static void showInches(int meters) {
    double inches = meters * 39.37;

    System.out.println(meters + " meters is " + inches + " kilometers.");
    menuOptions(meters);
  }

  public static void showFeet(int meters) {
    double feet = meters * 3.281;

    System.out.println(meters + " meters is " + feet + " kilometers.");
    menuOptions(meters);
  }

  public static void quit() {
    System.out.println("Bye!");
  }
}
