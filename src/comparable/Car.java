package comparable;


public class Car implements Comparable<Car> {

  private int speed;
  private String name;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Car(int speed, String name) {
    this.speed = speed;
    this.name = name;
  }

  @Override
  public int compareTo(Car car) {
    if(this.speed > car.speed) {
      return 1;
    }
    else if(this.speed == car.speed) {
      return 0;
    }
    else {
      return -1;
    }
  }
}
