package Lambda.InnerInterface;

public class ButtonEx {

  public static void main(String[] args) {
    Button OKBtn = new Button();

    OKBtn.setClickListner(
        () -> {
          System.out.println("OK 버튼");
        }
    );

    OKBtn.click();

    Button cancelBtn = new Button();
    cancelBtn.setClickListner(() -> System.out.println("cancel 버튼"));

    cancelBtn.click();
  }
}
