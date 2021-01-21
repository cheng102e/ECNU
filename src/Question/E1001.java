package Question;

import java.util.Scanner;

public class E1001 {

  public static void fun() {

    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String s1 = sc.next();
      String s2 = sc.next();
      StringBuilder a = new StringBuilder(s1);
      StringBuilder b = new StringBuilder(s2);
      a.reverse();
      b.reverse();

      int m = a.length();
      int n = b.length();
      int max = Math.max(m, n);
      if (m < n) {
        for (int i = m; i < n; i++) {
          a.append('0');
        }
      } else {
        for (int i = n; i < m; i++) {
          b.append('0');
        }
      }
      int[] ans = new int[max + 1];
      for (int i = 0; i < max; i++) {
        ans[i] = (a.charAt(i) - '0') + (b.charAt(i) - '0');
      }
      for (int i = 0; i < max; i++) {
        ans[i + 1] += ans[i] / 10;
        ans[i] %= 10;
      }
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < max; i++) {
        result.append(ans[i]);
      }
      if (ans[max] != 0) {
        result.append(ans[max]);
      }
      System.out.println(result.reverse().toString());
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
