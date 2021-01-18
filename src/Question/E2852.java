package Question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E2852 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuffer sb = new StringBuffer(str);
    int[] a = new int[27];
    int count = 0;
    for (int i = 0; i < sb.length(); i++) {
      char temp = sb.charAt(i);
      if (temp >= 'a' && temp <= 'z') {
        a[temp - 'a']++;
        count++;
      }
    }
    int max = a[25];
    int tag = 25;
    for (int i = 24; i >= 0; i--) {
      if (a[i] >= max) {
        max = a[i];
        tag = i;
      }
    }
    char ans = (char) (tag + 'a');
    double pin = (double) max / (double) count;
    System.out.print(ans + " ");
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.print(df.format(pin));
  }

  public static void main(String[] args) {
    fun();
  }

}
