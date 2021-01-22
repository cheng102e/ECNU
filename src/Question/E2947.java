package Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E2947 {

  public static class Team {
    public int[] a = new int[52];
    public int length;
  }

  public static void fun() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      Team[] team = new Team[n];
      for (int j = 0; j < n; j++) {
        team[j] = new Team();
      }

      for (int j = 0; j < n; j++) {
        int count = 0;
        while (true) {
          int temp = sc.nextInt();
          if (temp == -1) {
            break;
          }
          team[j].a[count] = temp;
          count++;
        }
        team[j].length = count;
      }
      Arrays.sort(team, new Comparator<Team>() {
        @Override
        public int compare(Team o1, Team o2) {
          for (int i = 0; i < Math.min(o1.length, o2.length); i++) {
            if (o1.a[i] != o2.a[i]) {
              return o2.a[i] - o1.a[i];
            }
          }
          return o2.length - o1.length;
        }
      });

      for (int j = 0; j < n; j++) {
        for (int k = 0; k < team[j].length; k++) {
          System.out.print(team[j].a[k] + " ");
        }
        System.out.println();
      }
    }

  }

  public static void main(String[] args) {
    fun();
  }

}
