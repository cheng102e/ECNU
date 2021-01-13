package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2021-01-11 15:36
 */


import java.util.Scanner;

public class E1147 {

  public static void cal(int n, int r) {
    int flag = 0;
    //0+1-
    if (n < 0) {
      flag = 1;
      n = (-1) * n;
    }

    if (flag == 1) {
      System.out.print("-");
    }
    if (r == 10) {
      System.out.println(n);
    } else {
      int[] a = new int[36];
      int j = 0;
      while (n != 0) {
        a[j] = n % r;
        j++;
        n = n / r;
      }
      for (int num = j - 1; num >= 0; num--) {
        if (a[num] > 9) {
          char t = (char) (a[num] + 55);
          System.out.print(t);
        } else {
          System.out.print(a[num]);
        }
      }
      System.out.println();
    }
  }

  public static void fun() {
    Scanner sc = new Scanner(System.in);

    int t;
    t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      int r;
      r = sc.nextInt();
      cal(n, r);
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
