// Celsius to Fahrenheit Table
// Write a program that displays a table of the Celsius temperatures 0 through 20 and
// their Fahrenheit equivalents. The formula for converting a temperature from Celsius to Fahrenheit
// where F is the Fahrenheit temperature and C is the Celsius temperature. Your program must
// use a loop to display the table.

public class CtoFTable {
  public static void main(String[] args) {
    double tempF;
    int tempC;

    System.out.println("C | F");

    for (int i = 0; i <= 20; i++) {
      tempC = i;
      tempF = ((tempC * 1.8) + 32);

      System.out.println(tempC + "   " + tempF);
    }
  }
}