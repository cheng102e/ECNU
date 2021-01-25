package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class E2844 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    String mod = sc.next();

    ArrayList<Integer> list = new ArrayList<>();
    while (sc.hasNextInt()) {
      int temp = sc.nextInt();
      list.add(temp);
    }
    if (mod.charAt(0)=='A') {
      Collections.sort(list);
    } else {
      list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o2-o1;
        }
      });
    }

    Iterator<Integer> it = list.iterator();
    int tag = 1001;
    int flag = 1;
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
  }

  public static void main(String[] args) {
    fun();
  }

}
