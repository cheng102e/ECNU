package Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class E3150 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list0 = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      list0.add(temp);
    }
    Collections.sort(list0);
    Iterator<Integer> it = list0.iterator();
    int tag = 101;
    int flag = 1;
    while (it.hasNext()) {
      int temp = it.next();
      if(temp!=tag)
      {
        if(flag!=1)
        {
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
