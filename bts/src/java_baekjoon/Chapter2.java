package java_baekjoon;

import java.io.*;
import java.util.*;

public class Chapter2 {
    public static void main(String[] args) throws IOException {
        ex07();
    }

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        br.close();
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        br.close();
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        br.close();
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        br.close();
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            hour--;
            minute += (60 - 45);
        }
        else {
            minute -= 45;
        }

        if(hour < 0) {
            hour = 23;
        }

        System.out.println(hour + " " + minute);

        br.close();
    }

    public static void ex06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int alarm = Integer.parseInt(br.readLine());

        minute += alarm;
        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + minute);

        br.close();
    }

    public static void ex07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int prize = 0;

        if( x == y && y == z) {
            prize = 10000 + x * 1000;
        }
        else if( x == y || y == z || z == x) {
            prize = 1000 + getSame(x, y, z) * 100;
        }
        else {
            prize = Math.max(x, Math.max(y, z)) * 100;
        }

        System.out.println(prize);

        br.close();
    }

    public static int getSame(int x, int y, int z) {
        if(x == y) {
            return x;
        } else {
            return z;
        }
    }
}