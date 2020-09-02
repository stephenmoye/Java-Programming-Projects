// 5. Sales Prediction
// The East Coast sales division of a company generates 62 percent of total sales. 
// Based on that percentage, write a program that will predict how much the East Coast division will
// generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
// represent 62 percent. 

public class SalesPrediction {

  public static void main(String[] args) {
    int totalSales = 4600000;
    double eastCoastTotal, eastCoastSales = 0.62;

    eastCoastTotal = totalSales * eastCoastSales;
    System.out.printf("The East Coast division will generate $" + eastCoastTotal + " in sales this year.");
  }
}