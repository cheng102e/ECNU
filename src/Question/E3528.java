package Question;

import java.util.Scanner;

public class E3528 {


  public static void fun() {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    int max = 0;
    for (int i = 0; i < n; i++) {
      max = 0;
      for (int j = 0; j < m; j++) {
        int temp = sc.nextInt();
        if (temp > max) {
          max = temp;
        }
      }
      count += max;
    }
    System.out.print(count);
  }

  public static void main(String[] args) {
    fun();
  }

}
