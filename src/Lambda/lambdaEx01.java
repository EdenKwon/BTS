package Lambda;

interface Calculator {
  int operate(int x, int y);
}

public class lambdaEx01 {

  public static void main(String[] args) {
    Calculator plus = (x, y) -> x + y;
    Calculator minus = (x, y) -> x -y;
    Calculator multiple = (x, y) -> x * y;

    System.out.println(plus.operate(5, 10));
    System.out.println(minus.operate(50, 10));
    System.out.println(multiple.operate(5, 10));
  }
}
