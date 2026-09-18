import java.util.*;
public class test {
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello enter an number :");
    int n = input.nextInt();
    int i = 0;
    count(1, n);

  }
  static void count(int i, int n){
    if(i>n){
      return;
    }
      System.out.println(i);
    
    count(i+1, n);
  }
}
