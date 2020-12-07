// /**
//    You must complete this program so it calculates
//    and displays the area of a rectangle. 
// */

// // The program calls the following methods, which have not been written:
// // •	 getLength—This method should ask the user to enter the rectangle’s length, and then
// // return that value as a double.
// // •	 getWidth—This method should ask the user to enter the rectangle’s width, and then
// // return that value as a double.
// // •	 getArea—This method should accept the rectangle’s length and width as arguments, and
// // return the rectangle’s area. The area is calculated by multiplying the length by the width.
// // •	 displayData—This method should accept the rectangle’s length, width, and area as
// // arguments, and display them in an appropriate message on the screen

// // Insert any necessary import statements here.
import java.util.Scanner;

public class RectangleArea {

  public static void main(String[] args) {
    double length, // The rectangle's length
        width, // The rectangle's width
        area; // The rectangle's area

    // Get the rectangle's length from the user.
    length = getLength();

    // Get the rectangle's width from the user.
    width = getWidth();

    // Get the rectangle's area.
    area = getArea(length, width);

    // Display the rectangle data.
    displayData(length, width, area);
  }

  public static double getLength() {
    double length;
    Scanner input = new Scanner(System.in);

    System.out.println("Length(cm): ");
    length = input.nextInt();

    return length;
  }

  public static double getWidth() {
    double width;
    Scanner input = new Scanner(System.in);

    System.out.println("Width(cm): ");
    width = input.nextInt();

    return width;
  }

  public static double getArea(double length, double width) {
    double area = length * width;
    return area;
  }

  public static void displayData(double length, double width, double area) {
    System.out.println(length + " L |" + width + " W");
    System.out.println("Area: " + area + " cm²");
  }
}
