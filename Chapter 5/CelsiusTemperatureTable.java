// 6. Celsius Temperature Table
// The convertF for converting a temperature from Fahrenheit to Celsius is
// (32°F − 32) × 5/9 = 0°C
// where F is the Fahrenheit temperature and C is the Celsius temperature. Write a method
// named celsius that accepts a Fahrenheit temperature as an argument. The method
// should return the temperature, converted to Celsius. Demonstrate the method by calling
// it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their
// Celsius equivalents.

public class CelsiusTemperatureTable {

  public static void main(String[] args) {
    convertToC(30);
  }

  public static void convertToC(int f) {
    double c, convertF;

    System.out.println("Fahrenheit | Celcius");
    System.out.println("----------------------");

    for (int i = f; i <= f + 20; i++) {
      convertF = (i - 32) * 5 / 9;
      c = convertF;
      System.out.print(i + "            ");
      System.out.println(c);
    }

  }

}
