package java_baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ex06();
    }

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

        br.close();
    }

    //스터디 체크
    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 0, b = 0;
        int sumArr[] = new int[num];

        //for문에서 st 객체를 새로 생성해주어야 함.
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sumArr[i] = a + b;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(sumArr[i]);
        }

        br.close();
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
        br.close();
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int priceSum = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int price = 0, num = 0;

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            price = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());

            priceSum -= price * num;
        }

        if (priceSum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=0 ; i<num/4 ; i++) {
            System.out.print("long ");
        }

        System.out.println("int");

        br.close();
    }

    public static void ex06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int a = 0, b = 0;
        int sumArr[] = new int[num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sumArr[i] = a + b;
        }

        //bw에서 개행문자 써줘야함..
        for (int i = 0; i < num; i++) {
            bw.write(sumArr[i] + "\n");
        }

        br.close();
        bw.flush();
    }
}