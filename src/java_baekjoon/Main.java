package java_baekjoon;
//

import java.io.*;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ex08();
  }

  public static void ex01() throws IOException {
    int num = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[num];
    int count = 0;

    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int finder = Integer.parseInt(br.readLine());

    for (int i = 0; i < num; i++) {
      if (arr[i] == finder) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static void ex02() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    int num[] = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < N; i++) {
      if (num[i] < X) {
        System.out.print(num[i] + " ");
      }
    }
  }

  public static void ex03() throws IOException {
    int num = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[num];
    int max = -1000000;
    int min = 1000000;

    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    System.out.println(min + " " + max);
  }

  public static void ex04() throws IOException {
    int count = 0, max = 0;
    for (int i = 1; i <= 9; i++) {
      int num = Integer.parseInt(br.readLine());
      if (max < num) {
        max = num;
        count = i;
      }
    }

    System.out.println(max);
    System.out.println(count);
  }

  public static void ex05() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int num = Integer.parseInt(st.nextToken());
    int arr[] = new int[size];

    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int value = Integer.parseInt(st.nextToken());

      for (int j = start - 1; j < end; j++) {
        arr[j] = value;
      }
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void ex06() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int num = Integer.parseInt(st.nextToken());
    int arr[] = new int[size];

    for (int i = 1; i <= size; i++) {
      arr[i - 1] = i;
    }

    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      int front = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      int temp = 0;
      temp = arr[front - 1];
      arr[front - 1] = arr[end - 1];
      arr[end - 1] = temp;
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void ex07() throws IOException {
    int arr[] = new int[30];

    for (int i = 0; i < 28; i++) {
      int num = Integer.parseInt(br.readLine());
      arr[num - 1]++;
    }

    for (int i = 0; i < 30; i++) {
      if (arr[i] == 0) {
        System.out.println(i + 1);
      }
    }
  }

  public static void ex08() throws IOException {
    int arr[] = new int[42];
    int count = 0;

    for (int i = 0; i<10; i++) {
      int num = Integer.parseInt(br.readLine());
      arr[num%42]++; //ex) num이 2라면 arr[2]에 1++ why? 나머지는 0부터 시작하기 때문
    }

    for(int i = 0; i<42; i++) {
      if (arr[i] != 0) {
        count++;
      }
    }

    System.out.println(count);
  }
}
