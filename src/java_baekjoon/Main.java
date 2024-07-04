package java_baekjoon;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex02();
  }

  public static void ex01() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    String word = st.nextToken();
    int formation = Integer.parseInt(st.nextToken());
    long form10 = 0;

    for (int i = 0; i < word.length(); i++) {
      if (Character.isAlphabetic(word.charAt(word.length() - i - 1))) {
        int wordNum = word.charAt(word.length() - i - 1) - 55;
        form10 += (long) Math.pow(formation, i) * wordNum;
      } else {
        int wordNum = word.charAt(word.length() - i - 1) - 48;
        form10 += (long) Math.pow(formation, i) * wordNum;
      }
    }

    System.out.println(form10);
  }

  public static void ex02() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    long num = Long.parseLong(st.nextToken());
    int form = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();

    while(num != 0) {
      int left = (int)(num % form);

      if(left >= 10) {
        sb.append((char)(left+55));
      } else {
        sb.append(left);
      }
      num = num/form;
    }

    System.out.println(sb.reverse());
  }

  public static void ex03() throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int Quater = 0, Dime = 0, Nickel = 0, Penny = 0;
    int testCase = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCase; i++) {
      int cent = Integer.parseInt(br.readLine());
      Quater = cent / 25;
      cent %= 25;
      Dime = cent / 10;
      cent %= 10;
      Nickel = cent / 5;
      cent %= 5;
      Penny = cent;

      bw.write(Quater + " " + Dime + " " + Nickel + " " + Penny + "\n");
      bw.flush();
    }
  }
}