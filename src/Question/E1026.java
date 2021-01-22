package Question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E1026 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      double h = 0;
      if (n <= 2) {
        h = n * 5 - 5 + 1.75;
      } else {
        h = 10 + 3 * n - 9 + 1.75;
      }
      double t = Math.sqrt((2 * h) / 9.8);
      DecimalFormat df = new DecimalFormat("#0.000");
      System.out.println(df.format(t));
    }


  }

  public static void main(String[] args) {
    fun();
  }

}
