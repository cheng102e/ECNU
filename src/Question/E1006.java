package Question;

import java.util.Scanner;

public class E1006 {

  public static void prime(int a[], int max) {
    //不是素数标记为1
    a[0] = 1;
    a[1] = 1;
    for (int i = 2; i * i <= max; i++) {
      if (a[i] == 0) {
        for (int j = i * i; j <= max; j += i) {
          a[j] = 1;
        }
      }
    }
  }

  public static void fun() {
    int max = 1000010;
    int[] a = new int[max+1];
    prime(a, max);
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int count = 0;
      for (int i = n; i <= m; i++) {
        if (a[i] != 1) {
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
