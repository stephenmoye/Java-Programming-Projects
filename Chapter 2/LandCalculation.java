// 6. Land Calculation
// One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
// number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
// tract of land by the size of an acre to get the number of acres.

public class LandCalculation {
  public static void main(String[] args) {
    int acreCount, acre = 43560, landSize = 389767;

    acreCount = landSize / acre;
    System.out.print("There are " + acreCount + " acres in " + landSize + " square feet");
  }
}