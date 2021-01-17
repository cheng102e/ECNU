package Question;

import java.util.Scanner;

public class E3081 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    double d = sc.nextDouble();
    double p = sc.nextDouble();
    double r = sc.nextDouble();
    double ans = Math.log10(p / (p - d * r * 0.01)) / Math.log10(1 + r * 0.01);
    System.out.println(Math.round(ans));
  }

  public static void main(String[] args) {
    fun();
  }

}
