package Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E2849 {

  public static class Test {

    public String x;
    public int y;

    public Test(String x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static int longcheck(String x, String y) {
    StringBuffer sb1 = new StringBuffer(x);
    StringBuffer sb2 = new StringBuffer(y);
    for (int i = 0; i < x.length(); i++) {
      if (sb1.charAt(i) != sb2.charAt(i)) {
        return sb1.charAt(i) - sb2.charAt(i);
      }
    }
    return 1;
  }

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Test[] test = new Test[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      String num = sc.next();
      int score = sc.nextInt();
      if (score > 59) {
        test[i] = new Test(num, score);
      } else {
        test[i] = new Test("1", 110);
      }
    }

    Arrays.sort(test, new Comparator<Test>() {
      @Override
      public int compare(Test o1, Test o2) {
        if (o1.y != o2.y) {
          return o2.y - o1.y;
        } else {
          return longcheck(o1.x, o2.x);
        }
      }
    });
    for (int i = 0; i < n; i++) {
      if (test[i].y != 110) {
        System.out.println(test[i].x + " " + test[i].y);
      }
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
