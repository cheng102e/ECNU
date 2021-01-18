package Question;

import java.util.Scanner;

public class E2987 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int flag = 0;
      String str = sc.next();
      String[] sp = str.split("\\.");
      System.out.println("case #" + i + ":");
      for (int j = 0; j < 4; j++) {
        int temp = Integer.valueOf(sp[j]);
        if (temp < 0 || temp > 255) {
          flag = 1;
          System.out.println("No " + j + " " + sp[j]);
          break;
        }
      }
      if (flag == 0) {
        System.out.println("Yes");
      }
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
