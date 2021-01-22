package Question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E2862 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    double num = Math.sqrt((x * x + y * y));
    DecimalFormat df = new DecimalFormat("0.000");
    System.out.println(df.format(num));
  }

  public static void main(String[] args) {
    fun();
  }

}
