package Question;

import java.util.Scanner;


public class E3532 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num == 1) {
        System.out.println(1);
      } else {
        num = (num - 1) << 1;
        int use = (int) Math.sqrt(num);
        if (use * (use + 1) == num) {
          System.out.println(1);
        } else {
          System.out.println(0);
        }
      }
    }
  }

  public static void fun2() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 100000010;
    boolean[] a = new boolean[max];
    int count = 0;
    for (int i = 1; i <= max; i += count) {
      a[i] = true;
      count++;
    }
    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      if (a[temp]) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }

  public static void main(String[] args) {
    fun2();
  }

}
