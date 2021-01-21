package Question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E1002 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String str = sc.next();
      int[] a = new int[4];
      StringBuffer sb = new StringBuffer(str);
      int[] weight = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
      int flag = 0;
      int tag = 0;
      for (int j = 0; j < 32; j++) {
        int temp = 1;
        if ((sb.charAt(j) == '0')) {
          temp = 0;
        }
        a[flag] += weight[tag] * temp;
        tag++;
        if (tag == 8) {
          tag = 0;
          flag++;
        }
      }
      System.out.println(a[0] + "." + a[1] + "." + a[2] + "." + a[3]);
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
