// Serendipity Booksellers has a book club that awards points to its customers based on the
// number of books purchased each month. The points are awarded as follows:
// •	 If a customer purchases 0 books, he or she earns 0 points.
// •	 If a customer purchases 1 book, he or she earns 5 points.
// •	 If a customer purchases 2 books, he or she earns 15 points.
// •	 If a customer purchases 3 books, he or she earns 30 points.
// •	 If a customer purchases 4 or more books, he or she earns 60 points.
// Write a program that asks the user to enter the number of books that he or she has purchased this month and then displays the number of points awarded.

import java.util.Scanner;

public class BookClub {
  public static void main(String[] args) {
    int books, points;
    Scanner input = new Scanner(System.in);

    System.out.print("How many books did you purchase this month? ");
    books = input.nextInt();

    if (books <= 0) {
      points = 0;
    } else if (books == 1) {
      points = 5;
    } else if (books == 2) {
      points = 15;
    } else if (books == 3) {
      points = 30;
    } else {
      points = 60;
    }
    System.out.println("You have been awarded " + points + " points.");

    input.close();
  }
}
