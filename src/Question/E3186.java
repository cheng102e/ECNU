package Question;

import java.util.Scanner;

public class E3186 {

  static String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
      "nine"};

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String temp = sc.nextLine();
    for (int count = 0; count < n; count++) {
      String str = sc.nextLine();
      String[] sp = str.split(" ");
      int flag = 0;
      int add1 = 0, add2 = 0;
      for (int i = 0; i < sp.length; i++) {
        if (sp[i].equals("+")) {
          flag = 1;
          continue;
        }
        if (flag == 0) {
          for (int j = 0; j < 10; j++) {
            if (sp[i].equals(num[j])) {
              add1 *= 10;
              add1 += j;
              break;
            }
          }
        } else {
          for (int j = 0; j < 10; j++) {
            if (sp[i].equals(num[j])) {
              add2 *= 10;
              add2 += j;
              break;
            }
          }
        }
      }
      System.out.println("case #" + count + ":");
      System.out.println(add1 + add2);
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
