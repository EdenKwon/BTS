package java_baekjoon;

import java.io.*;
import java.util.*;

public class Chapter7 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex04();
  }

  public static void ex01() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int width = Integer.parseInt(st.nextToken());
    int height = Integer.parseInt(st.nextToken());
    int[][] arr1 = new int[width][height];
    int[][] arr2 = new int[width][height];

    arr1 = getArr(arr1);
    arr2 = getArr(arr2);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        System.out.print(arr1[i][j] + arr2[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] getArr(int[][] arr) throws IOException {
    for (int i = 0; i < arr.length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    return arr;
  }

  public static void ex02() throws IOException {
    int arr[][] = new int[9][9];
    int max = 0;
    int x = 1, y = 1;

    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (max < arr[i][j]) {
          max = arr[i][j];
          x = i + 1;
          y = j + 1;
        }
      }
    }

    System.out.println(max);
    System.out.println(x + " " + y);
  }

  public static void ex03() throws IOException {
    char alp[][] = new char[5][];
    int wordMaxLength = 0;

    for (int i = 0; i < 5; i++) {
      String word = br.readLine();
      alp[i] = new char[word.length()];

      if (word.length() > wordMaxLength) {
        wordMaxLength = word.length();
      }

      for (int j = 0; j < word.length(); j++) {
        alp[i][j] = word.charAt(j);
      }
    }

    for (int i = 0; i < wordMaxLength; i++) {
      for (int j = 0; j < 5; j++) {
        if (alp[j].length <= i) {
          continue;
        }

        System.out.print(alp[j][i]);
      }
    }
  }

  public static void ex04() throws IOException {
    StringTokenizer st;
    int whitePaper[][] = new int[100][100];
    int num = Integer.parseInt(br.readLine());
    int x = 0, y = 0, count = 0;

    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());

      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          whitePaper[j][k]++;
        }
      }
    }

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (whitePaper[i][j] != 0) {
          count++;
        }
      }
    }

    System.out.println(count);
    /*long count1 = Arrays.stream(whitePaper).flatMapToInt(Arrays::stream).filter(element -> element !=0).count();
    System.out.println(count1);*/
  }
}