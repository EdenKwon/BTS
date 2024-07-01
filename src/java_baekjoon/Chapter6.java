package java_baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Chapter6 {

  public static void main(String[] args) {
    ex01();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
      for (int j = i; j < num; j++) {
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

    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        isPal = false;
      }
    }

    if (isPal) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }

  public static void ex05() throws IOException {
    String word = br.readLine();
    int alphabet[] = new int[26];
    int max = 0;
    char maxAlp = ' ';

    word = word.toUpperCase();

    for (int i = 0; i < word.length(); i++) {
      alphabet[word.charAt(i) - 'A']++;
    }

    for (int i = 0; i < alphabet.length; i++) {
      if (max < alphabet[i]) {
        max = alphabet[i];
        maxAlp = (char) ('A' + i);
      } else if (max == alphabet[i]) {
        maxAlp = '?';
      }
    }

    System.out.println(maxAlp);
  }

  public static void ex06() throws IOException {
    String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    String word = br.readLine();

    for (int i = 0; i < croatia.length; i++) {
      if (word.contains(croatia[i])) {
        word = word.replace(croatia[i], ".");
      }
    }

    System.out.println(word.length());
  }

  public static void ex07() throws IOException {
    int num = Integer.parseInt(br.readLine());
    int count = 0;

    for(int i=0; i<num; i++) {
      String word = br.readLine();

      if (checkGroupWord(word)) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static boolean checkGroupWord(String word) {
    int len = word.length();
    for (int i = 0; i < len - 1; i++) {
      if (word.charAt(i) != word.charAt(i + 1)) {
        for (int j = i + 2; j < len; j++) {
          if (word.charAt(i) == word.charAt(j)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  public static void ex08() throws IOException {
    double subSum = 0;
    double gradeSum = 0;

    for (int i=0; i<20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String subject = st.nextToken();
      double score = Double.parseDouble(st.nextToken());
      String grade = st.nextToken();

      if (grade.equals("P")) {
        continue;
      }

      subSum += score;
      gradeSum += score * convertGrade(grade);
    }

    System.out.printf("%.6f", gradeSum / subSum);
  }

  public static double convertGrade(String grade) {
    switch (grade) {
      case "A+":
        return 4.5;
      case "A0":
        return 4.0;
      case "B+":
        return 3.5;
      case "B0":
        return 3.0;
      case "C+":
        return 2.5;
      case "C0":
        return 2.0;
      case "D+":
        return 1.5;
      case "D0":
        return 1.0;
      case "F":
        return 0.0;
      default:
        return 0;
    }
  }
}
