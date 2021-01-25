package Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class E2975 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      ArrayList<Integer> list = new ArrayList<>();
      int n = sc.nextInt();
      for (int j = 0; j < n; j++) {
        int temp = sc.nextInt();
        list.add(temp);
      }
      list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          int a = o1 % 10, b = o2 % 10;
          if (a != b) {
            return a - b;
          } else {
            return o1 - o2;
          }
        }
      });
      Iterator<Integer> it = list.iterator();
      int tag = 1001;
      int flag = 1;
      System.out.println("case #" + i + ":");
      while (it.hasNext()) {
        int temp = it.next();
        if (temp != tag) {
          if (flag != 1) {
            System.out.print(" ");
          }
          System.out.print(temp);
          flag++;
        }
        tag = temp;
      }
      System.out.println();
    }


  }

  public static void main(String[] args) {
    fun();
  }

}
