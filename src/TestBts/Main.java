package TestBts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    ex02();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void ex01() throws IOException {
    int arr[] = new int[5];
    int minHam = 2000, minDrink = 2000;

    //0,1,2에 버거 값 저장, 3,4에 음료 저장
    for (int i = 0; i < 5; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    //버거 최저값
    for(int i=0; i<3;i++) {
      if(minHam > arr[i]) {
        minHam = arr[i];
      }
    }

    for(int i=3; i<5; i++) {
      if(minDrink > arr[i]) {
        minDrink = arr[i];
      }
    }

    System.out.println(minDrink+minHam-50);
  }

  public static void ex01_1() throws IOException{
    int arrHam[] = new int[3];
    int arrDrink[] = new int[2];
    int minHam , minDrink;

    //버거 저장
    for (int i = 0; i < 3; i++) {
      arrHam[i] = Integer.parseInt(br.readLine());
    }

    //음료 저장
    for (int i = 0; i < 2; i++) {
      arrDrink[i] = Integer.parseInt(br.readLine());
    }

    minHam = Arrays.stream(arrHam).min().getAsInt();
    minDrink = Arrays.stream(arrDrink).min().getAsInt();

    System.out.println(minDrink+minHam-50);
  }

  public static void ex01_2() throws IOException{
    List<Integer> hamList = new ArrayList<>();
    List<Integer> drinkList = new ArrayList<>();
    int minHam, minDrink;

    for(int i=0; i<3; i++) {
      hamList.add(Integer.valueOf(br.readLine()));
    }

    for(int i=3; i<5; i++) {
      drinkList.add(Integer.valueOf(br.readLine()));
    }
  }

  public static void ex02() throws IOException{
    int arr[] = new int[5];
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      arr[i] = Integer.parseInt(br.readLine());

      if(arr[i] < 40) {
        arr[i] = 40;
      }
      sum += arr[i];
    }

    System.out.println(sum / 5);

  }
}
