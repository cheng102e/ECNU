package Question;

import java.util.Scanner;

public class E3291 {

  public static void sushu(int a[], int max) {
    a[1] = 1;
    for (int i = 2; i * i <= max; i++) {
      if (a[i] == 0) {
        for (int j = i * i; j <= max; j += i) {
          a[j] = 1;
        }
      }
    }
  }

  public class give implements Comparable {

    public int x;
    public int y;
    public int ans;

    @Override
    public int compareTo(Object o) {
      return 0;
    }
  }

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int min = 10001;
    int max = 0;
    int[] num = new int[10001];
    sushu(num, 10000);
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();

      System.out.println("case #" + i + ":");
      for (int j = 0; j < n; j++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (; x <= y; x++) {
          if (num[x] == 0) {
            count++;
          }
        }

      }
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
