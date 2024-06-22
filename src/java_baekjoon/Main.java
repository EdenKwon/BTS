package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex03();
  }

  public static void ex01() throws IOException {
    String word = br.readLine();
    int num = Integer.parseInt(br.readLine());

    System.out.println(word.charAt(num - 1));
  }

  public static void ex02() throws IOException {
    String word = br.readLine();

    System.out.println(word.length());
  }

  public static void ex03() throws IOException {
    int num = Integer.parseInt(br.readLine());
    String word[] = new String[num];

    for (int i = 0; i < num; i++) {
      word[i] = br.readLine();
    }

    for (int i = 0; i < num; i++) {
      System.out.print(word[i].charAt(0) + "" + word[i].charAt(word[i].length() - 1) + "\n");
    } // 중간에 ""를 넣어주지 않으면 아스키코드로 인식하여 숫자로 출력됨.
  }
}