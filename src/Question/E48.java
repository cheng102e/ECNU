package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E48 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = sc.next();

    }
    Arrays.sort(str, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.charAt(0) != o2.charAt(0)) {
          return o1.charAt(0) - o2.charAt(0);
        } else {
          StringBuffer sb1 = new StringBuffer(o1);
          StringBuffer sb2 = new StringBuffer(o2);
          for (int i = 1; i < Math.min(sb1.length(), sb2.length()); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
              return sb2.charAt(i) - sb1.charAt(i);
            }
          }
          return sb2.length() - sb1.length();
        }
      }
    });
    for (int i = 0; i < n; i++) {
      System.out.println(str[i]);
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
