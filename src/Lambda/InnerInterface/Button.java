package Lambda.InnerInterface;

public class Button {

  public interface ClickListner {

    void onclick();
  }

  private ClickListner clickListner;

  public void setClickListner(ClickListner clickListner) {
    this.clickListner = clickListner;
  }

  public void click() {
    this.clickListner.onclick();
  }
}
