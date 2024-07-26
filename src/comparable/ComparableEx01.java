package comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableEx01 {

  public static void main(String[] args) {
    Car car1 = new Car(100,"스피드백");
    Car car2 = new Car(200,"스피드이백");

    int result = car1.compareTo(car2);
    if(result == 1) {
      System.out.println(car1);
    } else if (result == 0 ) {
      System.out.println("같다");
    }else {
      System.out.println(car2+ "dkdkdk");
    }
  }
}
