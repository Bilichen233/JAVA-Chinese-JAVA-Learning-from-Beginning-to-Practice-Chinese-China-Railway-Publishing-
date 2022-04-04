public class er {
  public static void main(String[] args) {
    int x = 10, y = 0, z = 0;
    try {
      System.out.println("Before dividing x  by  y.");
      z = x / y;
      System.out.println("After dividing x  by  y.");
    } catch (ArithmeticException e) {
      System.out.println("Inside  catch block a.");
    } finally {
      System.out.println("Inside finally  block a.");
    }

    try {
      System.out.println("Before setting  z  to 2.");
      z = 2;
      System.out.println("After setting  z  to 2.");
    }
    catch (Exception e) {
      System.out.println("Inside  catch block b.");
    } finally {
      System.out.println("Inside finally  block b.");
    }
    try {
      System.out.println("Inside try block c.");
    }
    finally {
      System.out.println("Inside finally  block c.");
    }

    try {
      System.out.println("Before  executing System.exit().");
      System.exit(0);
      System.out.println("After  executing System.exit().");

    } finally {
      // This finally block will not be executed
      // because application exits in try block
      System.out.println("Inside finally  block d.");
    }
  }
}