package Test;

import java.util.Scanner;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-05-10 8:42
 */
public class score {
//于慧100篇答案计算 21版
  static char[][] ans = new char[101][6];

  public static void build() {
    ans[1]= new char[]{'d', 'b', 'd', 'c', 'a'};
    ans[2]= new char[]{'c', 'd', 'b', 'a', 'd'};
    ans[3]= new char[]{'a', 'c', 'd', 'b', 'a'};
    ans[4]= new char[]{'c', 'a', 'b', 'd', 'b'};
    ans[5]= new char[]{'c', 'b', 'd', 'd', 'a'};
    ans[6]= new char[]{'b', 'c', 'b', 'a', 'd'};
    ans[7]= new char[]{'b', 'a', 'c', 'd', 'b'};
    ans[8]= new char[]{'a', 'b', 'b', 'a', 'd'};
    ans[9]= new char[]{'c', 'd', 'c', 'b', 'a'};
    ans[10]= new char[]{'c', 'a', 'b', 'd', 'c'};
  }

  public static void main(String[] args) {

    build();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String s = sc.next();
    int right = 0;
    int wrong = 0;
    for (int i = 0; i < 5; i++) {
      if ((char) s.charAt(i) == ans[num][i]) {
        right++;
      } else {
        wrong++;
      }
    }

    System.out.print("right:  " + right + "   wrong:   " + wrong);
  /*  String[] str = new String[101];
    for (int i = 1; i <= 10; i++) {
      Scanner sc = new Scanner(System.in);
      str[i] = sc.next();
    }
    for (int i = 1; i <= 10; i++) {
      char a = (char) str[i].charAt(0);
      char b = (char) str[i].charAt(1);
      char c = (char) str[i].charAt(2);
      char d = (char) str[i].charAt(3);
      char e = (char) str[i].charAt(4);
      System.out.println(
          "ans[" + i + "]= new char[]{'" + a + "', '" + b + "', '" + c + "', '" + d + "', '" + e
              + "'};");
    }*/
  }
}
/*
1-10
  dbdca
      cdbad
  acdba
      cabdb
  cbdda
      bcbad
  bacdb
      abbad
  cdcba
      cabdc*/
