package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2021-01-10 10:36
 */


import java.util.Scanner;

public class E3529 {

  public static void fun() {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[][] a = new int[n][n + 1];
    for (int i = 0; i < n; i++) {
      a[i][0] = 1;
      a[i][i] = 1;
    }
    for (int i = 2; i < n; i++) {
      for (int j = 1; j < i; j++) {
        a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(a[i][j]);
        if (j != i) {
          System.out.print(" ");
        }
      }
      if (i != n - 1) {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
