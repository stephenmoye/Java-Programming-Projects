// 7. Test Average and Grade
// Write a program that asks the user to enter five test scores. The program should display
// a letter grade for each score and the average test score. Write the following methods in
// the program:
// •	 calcAverage—This method should accept five test scores as arguments and return the
// average of the scores.
// •	 determineGrade—This method should accept a test score as an argument and return a
// letter grade for the score, based on the following grading scale:
// Score | Letter Grade
// 90–100 A
// 80–89 B
// 70–79 C
// 60–69 D
// Below 60 F

import java.util.Scanner;

public class TestAverageAndGrade {
  public static void main(String[] args) {
    calcAverage();
  }

  public static void calcAverage() {
    int average, score, scores = 0;

    for (int i = 1; i <= 5; i++) {
      Scanner input = new Scanner(System.in);
      System.out.println("Test score " + i + ":");
      score = input.nextInt();
      scores += score;
    }

    average = scores / 5;

    determineGrade(average);

  }

  public static void determineGrade(int average) {
    String letterGrade;

    if (average >= 90) {
      letterGrade = "A";
    } else if (average >= 80) {
      letterGrade = "B";
    } else if (average >= 70) {
      letterGrade = "C";
    } else if (average >= 60) {
      letterGrade = "D";
    } else {
      letterGrade = "F";
    }
    System.out.println("Letter Grade: " + letterGrade);
    System.out.println("Test Score: " + average);
  }
}
