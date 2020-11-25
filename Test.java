import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    int over = 0, under = 0, positiveNum = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a positive number.");
    System.out.println("To end the program, enter -99.");

    while (positiveNum != -99) {
      System.out.print("Enter a number: ");
      positiveNum = keyboard.nextInt();

      if (positiveNum >= 100) {
        over++;
      } else {
        under++;
      }
    }

    System.out.println("You entered " + over + " numbers over 100.");
    System.out.println("You entered " + under + " numbers under 100.");

  }
}
