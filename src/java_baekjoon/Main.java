package java_baekjoon;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public Main() throws IOException {
  }

  public static void main(String[] args) throws IOException {
    ex07();
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

    while (num != 0) {
      int left = (int) (num % form);

      if (left >= 10) {
        sb.append((char) (left + 55));
      } else {
        sb.append(left);
      }
      num = num / form;
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

  public static void ex04() throws IOException {
    int num = Integer.parseInt(br.readLine());

    System.out.println((int) Math.pow(Math.pow(2, num) + 1, 2));
  }

  public static void ex05() throws IOException {
    int num = Integer.parseInt(br.readLine()) - 1;
    int countRoom = 1;
    int count = 0;

    while (true) {
      num -= 6 * count;

      if (num <= 0) {
        break;
      }
      countRoom++;
      count++;
    }

    System.out.println(countRoom);
  }

  public static void ex06() throws IOException {
    int nume = 1; //분자
    int deno = 1; //분모
    int num = Integer.parseInt(br.readLine());
    boolean isDenoPlusTime = true;

    for (int i = 1; i < num; i++) {
      if(deno == 1 && isDenoPlusTime == false) {
        nume++;
        isDenoPlusTime = true;
      }
      else if(nume == 1 && isDenoPlusTime == true) {
        deno++;
        isDenoPlusTime = false;
      }
      else if(isDenoPlusTime) {
        deno++;
        nume--;
      } else {
        deno--;
        nume++;
      }
    }

    System.out.println(nume + "/" + deno);
  }

  public static void ex07() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int morning = Integer.parseInt(st.nextToken());
    int evening = Integer.parseInt(st.nextToken());
    int height = Integer.parseInt(st.nextToken());

    int days = (int) Math.ceil((double) (height - morning) / (morning - evening)) + 1;

    bw.write(days + "");

    bw.flush();
    bw.close();
  }
}