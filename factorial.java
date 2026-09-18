import java.util.*;
public class factorial {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    System.out.println("factorial is :" + factorial(1,n));
    input.close();
  }
  static int factorial(int i, int n){
    if(i>n){
      return 1;
    }
    return i * factorial(i+1,n);
  }
  
}
