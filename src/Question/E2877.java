package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2021-01-10 10:36
 */


import java.util.Scanner;

public class E2877 {

  public static boolean check(int n) {
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int n;
      n = sc.nextInt();
      if (n > 20000 || n <= 4 || n % 2 != 0) {
        break;
      }

      for (int i = n / 2; i >= 1; i--) {
        if (check(i) && check(n - i)) {
          System.out.println(i + " " + (n - i));
          break;
        }
      }
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
