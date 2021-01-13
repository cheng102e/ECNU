package Question;

import java.util.Scanner;

public class E3533 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);

    int m, n, k;
    m = sc.nextInt();
    n = sc.nextInt();
    k = sc.nextInt();
    int m1 = -1, n1 = -1;
    for (int i = 0; i < k; i++) {
      m1 = (m1 + 1) % m;
      n1 = (n1 + 1) % n;
      System.out.println((m1 + 1) + " " + (n1 + 1));
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
