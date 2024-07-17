// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    boolean b1 = false;
    boolean b2 = true;
    boolean b3 = false;
    int result = (b1 && b2) ? 10 : (b2 || b3) ? 20 : 30;
    System.out.println(result);
  }
}
