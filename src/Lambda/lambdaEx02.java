package Lambda;

interface printer<T> {
  void print(T t);
}

public class lambdaEx02 {

  public static void main(String[] args) {
    printer<String> strPrint = x -> System.out.println(x);
    printer<Integer> intPrint = x -> System.out.println(x);

    strPrint.print("hello world!");
    intPrint.print(150);
  }
}
