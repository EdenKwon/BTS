package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex11();
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

  public static void ex04() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char a = str.charAt(0);
    System.out.println((int) a);
  }

  public static void ex05() throws IOException {
    int num = Integer.parseInt(br.readLine());
    String numbers = br.readLine();
    int sum = 0;

    for (int i = 0; i < num; i++) {
      sum += numbers.charAt(i) - '0';
    }

    System.out.println(sum);
  }

  public static void ex06() throws IOException {
    String word = br.readLine();
    int alphabet[] = new int[26];
    Arrays.fill(alphabet, -1);

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (alphabet[ch - 'a'] == -1) {
        alphabet[ch - 'a'] = i;
      }
    }

    for (int i = 0; i < alphabet.length; i++) {
      System.out.print(alphabet[i] + " ");
    }
  }

  public static void ex07() throws IOException {
    int num = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      int count = Integer.parseInt(st.nextToken());
      String word = st.nextToken();

      for (int j = 0; j < word.length(); j++) {
        for (int k = 0; k < count; k++) {
          sb.append(word.charAt(j));
        }
      }

      sb.append("\n");
    }

    System.out.println(sb);
  }

  public static void ex08() throws IOException {
    String words = br.readLine();
    StringTokenizer st = new StringTokenizer(words, " ");
    System.out.println(st.countTokens());
  }

  public static void ex09() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder num1 = new StringBuilder(st.nextToken()).reverse();
    StringBuilder num2 = new StringBuilder(st.nextToken()).reverse();

    if (Integer.parseInt(num1.toString()) > Integer.parseInt(num2.toString())) {
      System.out.println(num1);
    } else {
      System.out.println(num2);
    }
  }

  public static void ex10() throws IOException {
    String word = br.readLine();
    int sum = 0;

    /*for (int i = 0; i < word.length(); i++) {
      switch (word.charAt(i)) {
        case 'A', 'B', 'C':
          sum += 3;
          break;
        case 'D', 'E', 'F':
          sum += 4;
          break;
        case 'G', 'H', 'I':
          sum += 5;
          break;
        case 'J', 'K', 'L':
          sum += 6;
          break;
        case 'M', 'N', 'O':
          sum += 7;
          break;
        case 'P', 'Q', 'R', 'S':
          sum += 8;
          break;
        case 'T', 'U', 'V':
          sum += 9;
          break;
        case 'W', 'X', 'Y', 'Z':
          sum += 10;
          break;
      }*/

    for (int i = 0; i < word.length(); i++) {
      switch (word.charAt(i)) {
        case 'A':
        case 'B':
        case 'C':
          sum += 3;
          break;
        case 'D':
        case 'E':
        case 'F':
          sum += 4;
          break;
        case 'G':
        case 'H':
        case 'I':
          sum += 5;
          break;
        case 'J':
        case 'K':
        case 'L':
          sum += 6;
          break;
        case 'M':
        case 'N':
        case 'O':
          sum += 7;
          break;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
          sum += 8;
          break;
        case 'T':
        case 'U':
        case 'V':
          sum += 9;
          break;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
          sum += 10;
          break;
      }
    }

    System.out.println(sum);
  }

  public static void ex11() throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word;

    while ((word = br.readLine()) != null) {
      bw.write(word + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}