// The date June 10, 1960, is special because when we write it in the following format, the
// month times the day equals the year:
// 6/10/60
// Write a program that asks the user to enter a month (in numeric form), a day, and a twodigit year. The program should then determine whether the month times the day is equal
// to the year. If so, it should display a message saying the date is magic. Otherwise, it should
// display a message saying the date is not magic.

import java.util.Scanner;

public class MagicDates {
  public static void main(String[] args) {
  System.out.println("-=Magic Date Detector=-");
  System.out.println("Please input all dates as MM/DD/YY (2 digits)");

  int month, day, year;
  Scanner input = new Scanner(System.in);

  System.out.print("What is the month? ");
  month = input.nextInt();
  System.out.print("What is the day? ");
  day = input.nextInt();
  System.out.print("What is the year? ");
  year = input.nextInt();

  if (month * day == year) {
    System.out.print(month + "/" + day + "/" + year + " IS a Magic Date! :)");
  } else {
    System.out.print(month + "/" + day + "/" + year + " is NOT Magic Date! :(");
  }
  input.close();

  }
}
