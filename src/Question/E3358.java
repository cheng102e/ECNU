package Question;

import java.util.Scanner;

public class E3358 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int t = sc.nextInt();
      int count = 0;
      for (int j = 0; j < t; j++) {
        int temp = sc.nextInt();
        if (temp <= 10) {
          count++;
        }
      }
      System.out.println(count);
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
