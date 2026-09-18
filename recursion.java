import java.util.*;
public class recursion {
  public static void main (String args[]){
    System.out.println("Hello enter a number:");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    count(1, n);
    input.close();
  }
  static void count(int i, int n){
    if(i>n){
      return;
    }
    System.out.println(n);
    count(i,n-1);
  }
}
