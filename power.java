import java.util.*;
public class power {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = input.nextInt();
    System.out.println("Enter its power");
    int i = input.nextInt();
    System.out.println("your answer is: "+ power(i,n,1));
    input.close();
  }
  static int power(int i, int n, int j){
     if(i<j){
      return 1;
     }
     return n * power(i, n, j+1);
  }

}
