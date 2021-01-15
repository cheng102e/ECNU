package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2021-01-11 15:36
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class E2002 {

  public static final DecimalFormat df = new DecimalFormat("#.000");

  public static void fun() {

    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      double num = Math.sqrt((x * x + y * y));
      System.out.println(df.format(num));
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
