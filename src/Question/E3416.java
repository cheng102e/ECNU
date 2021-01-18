package Question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E3416 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    DecimalFormat df = new DecimalFormat("0.00");
    int count = Integer.valueOf(str.substring(0, 2));
    if (str.charAt(2) == 'f') {
      double temp = count;
      System.out.print(df.format((((temp - 32) * 5) / 9)) + "c");
    } else {
      double temp = count;
      System.out.print(df.format((temp * 9) / 5 + 32) + "f");
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
