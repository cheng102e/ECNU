package Question;

import java.util.Scanner;

public class E3531 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n + 1];
    int k = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      a[i] = 1;
    }
    for (int i = 0; i < k; i++) {
      int temp = sc.nextInt();
      a[temp] = 0;
    }
    if (a[n] == 0) {
      System.out.print(0);
    } else if (n <= 3) {
      int sum = 0;
      if (n == 1) {
        sum = a[1];
      } else if (n == 2) {
        sum = a[1] + a[2];
      } else {
        sum = a[1] + a[1] + a[2] + a[3];
      }
      System.out.print(sum);
    } else {
      if (a[1] != 0) {
        a[1] = 1;
      }
      if (a[2] != 0) {
        a[2] = a[1] + 1;
      }
      if (a[3] != 0) {
        a[3] = a[2] + a[1] + 1;
      }
      for (int i = 3; i < n; i++) {
        if (a[i + 1] != 0) {
          a[i + 1] = a[i] + a[i - 1] + a[i - 2];
        }
      }
      System.out.print(a[n]);
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
