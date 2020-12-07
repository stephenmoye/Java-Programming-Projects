// 4. Paint Job Estimator
// A painting company has determined that 
// for every 115 square feet of wall space, 
// one gallon of paint
// eight hours of labor will be required. 
// The company charges $18.00 per hour for labor.
// Write a program that allows the user to enter the number of rooms to be painted
// and the price of the paint per gallon. It should also ask for the square feet of wall space in
// each room. The program should have methods that return the following data:
// •	 The number of gallons of paint required
// •	 The hours of labor required
// •	 The cost of the paint
// •	 The labor charges
// •	 The total cost of the paint job
// Then it should display the data on the screen

import java.util.Scanner;

public class PaintJobEstimator {
  public static void main(String[] args) {
    quote();
  }

  public static void quote() {
    int rooms, sqft;
    double price;

    Scanner input = new Scanner(System.in);

    System.out.print("How many rooms are you painting? ");
    rooms = input.nextInt();

    System.out.print("What is the price of the paint (per gallon)? ");
    price = input.nextDouble();

    System.out.print("How many square feet are the rooms? ");
    sqft = input.nextInt();

    input.close();

    estimate(rooms, sqft, price);

  }

  public static void estimate(int rooms, int sqft, double price) {
    double gallons, paintCost, laborHours, laborCost, total;

    gallons = sqft / 115;
    paintCost = gallons * price;
    laborHours = gallons * 8;
    laborCost = laborHours * 18;
    total = paintCost + laborCost;

    System.out.println("Gallons of paint required: " + gallons);
    System.out.println("Hours of labor required: " + laborHours);
    System.out.println("Cost of paint: " + paintCost);
    System.out.println("Cost of labor: " + laborCost);
    System.out.println("Total: " + total);

  }

}
