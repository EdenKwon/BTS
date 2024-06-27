package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex04();
  }

  public static void ex01() {
    System.out.println("         ,r'\"7\n"
        + "r`-_   ,'  ,/\n"
        + " \\. \". L_r'\n"
        + "   `~\\/\n"
        + "      |\n"
        + "      |");
  }

  public static void ex02() throws IOException {
    int myChess[] = new int[6];
    int chess[] = {1, 1, 2, 2, 2, 8};

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < 6; i++) {
      chess[i] = chess[i] - Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < 6; i++) {
      System.out.print(chess[i] + " ");
    }
  }

  public static void ex03() throws IOException {
    int num = Integer.parseInt(br.readLine());

    //상반신
    for (int i = 1; i <= num; i++) {
      for (int j = num - i; j > 0; j--) {
        System.out.print(" ");
      }

      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //하반신
    for (int i = num - 1; i >= 1; i--) {
      for(int j= i; j<num; j++) {
        System.out.print(" ");
      }

      for (int j = 2 * i - 1; j > 0; j--) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

  public static void ex04() throws IOException {
    String word = br.readLine();
    boolean isPal = true;

    for(int i=0; i<word.length()/2; i++) {
      if(word.charAt(i) != word.charAt(word.length()-i-1)){
        isPal = false;
      }
    }

    if(isPal) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}