import java.util.*;
public class even {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello Enter a number: ");
    int n = input.nextInt();
    even(0, n);
    input.close();

  }
  static void even(int i, int n){
    if(i>n){
      return;
    }
    if(i%2==0){
      System.out.println(i);
    }
    even(i+1,n);
  }
}
