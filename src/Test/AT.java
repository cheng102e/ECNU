package Test;

import java.util.Scanner;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */


public class AT {

  static int count=0;
  public static void find(int[] set,int i,int length,int m){
    if(length==0&&i%m==0){
      count++;
    }
    int templen = length;
    int tempi = i;
    for(int j=1;j<=9;j++){
      if (set[j]>0&&templen>0){
        for(int x=1;x<=9;x++){
          System.out.print(set[x]);
        }
        System.out.println();
        set[j]--;
        templen--;
        tempi = i*10 +j;
        find(set,tempi,templen,m);
        set[j]++;
      }
    }
  }
  //0 0.5
  //1 0.1
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int m = sc.nextInt();
    int ans = 0;
    int length = s.length();
    int [] set = new int[10];
    StringBuffer str = new StringBuffer(s);
    for(int i=0;i<length;i++){
      set[str.charAt(i)-'0']++;
    }
    find(set,0,length,m);
    System.out.print(count);
  }
}
