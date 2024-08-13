package comparable;

import java.util.Comparator;

public class ComparatorEx01 {

  public static void main(String[] args) {
    Car car1 = new Car(100,"스피드백");
    Car car2 = new Car(200,"스피드이백");

    Comparator<Car> comp = new Comparator<Car>() {
      @Override
      public int compare(Car o1, Car o2) {
        if(o1.getSpeed() > o2.getSpeed()) return 1;
        else if (o1.getSpeed() == o2.getSpeed()) return 0;
        else return -1;
      }
    };

    int result = comp.compare(car1,car2);
    if(result == 1) {
      System.out.println(car1.getName());
    } else if (result == 0 ) {
      System.out.println("같다");
    }else {
      System.out.println(car2.getName());
    }
  }
}
