package Question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class E3530 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> list = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      String temp = sc.next();
      list.add(temp);
    }
    list.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {

        String str1 = o1 + o2;
        String str2 = o2 + o1;

        return Integer.valueOf(str2) - Integer.valueOf(str1);
      }
    });

    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      System.out.print(it.next());
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
