package Question;

import java.util.Scanner;

public class E3119 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }
    if (a > c) {
      int temp = c;
      c = a;
      a = temp;
    }
    if (b > c) {
      int temp = c;
      c = b;
      b = temp;
    }
    System.out.print(a + " " + b + " " + c);
  }

  public static void main(String[] args) {
    fun();
  }

}
