package com.hendisantika.alignstartcase;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project : rightAlignStarCase
 * User: hendisantika
 * Email:
 * hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/04/20 Time: 13.05
 */
public class MainApp {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int rows = myObj.nextInt();

    rightTriangle(rows);
  }

  public static void rightTriangle(int rows) {
    int n = rows;
    int i, j;

    for (i = 0; i < n; i++) {
      for (j = 2 * (n - i); j >= 0; j--) {
        System.out.print(" ");
      }

      for (j = 0; j <= i; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
