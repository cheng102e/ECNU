package Question;

import java.util.Scanner;

public class E1030 {


  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[52];
    a[1] = 1;
    a[2] = 1;
    a[3] = 1;
    for (int i = 4; i < 51; i++) {
      a[i] = a[i - 3] + a[i - 1];
    }
    while (true)
    {
      int temp = sc.nextInt();
      if(temp==0){
        break;
      }
      System.out.println(a[temp]);
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
