package Question;

import java.util.Scanner;

public class E1000 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt())
    {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a+b);
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
