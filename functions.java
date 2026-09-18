import java.util.Scanner;

public class functions {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter first number");
    int x = inp.nextInt();
    System.out.println("Enter another number");
    int y = inp.nextInt();
    int result = sum(x, y);
    System.out.print("the Sum of two number is "+ result);
    inp.close();
  } 

  static int sum(int a, int b) {
    int result = a+b;
    return (result);
  }
}


  