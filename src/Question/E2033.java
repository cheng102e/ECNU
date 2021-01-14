package Question;

import java.util.Scanner;

public class E2033 {

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String str;
      str = sc.nextLine();
      String reverse = new StringBuffer(str).reverse().toString();
      StringBuffer sb = new StringBuffer(str);
      int n= sb.length();
      for(int i=0;i<n/2;i++)
      {
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(n-i-1));
        sb.setCharAt(n-i-1,temp);
      }
      System.out.println(sb.toString());
    }
  }

  public static void main(String[] args) {
    fun();
  }

}
