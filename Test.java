import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    int a = 5, b = 10, c = 15, d = 20;
    if (b <= c)
      System.out.println(b + "  " + c);
    a = a + b;
    if (d < 18)
      System.out.println("d= " + d);
    b = b + c;
    if (c <= a)
      System.out.println("c is less than a  ");
    System.out.println(a + " " + b + " " + c + " " + d);

  }
}
