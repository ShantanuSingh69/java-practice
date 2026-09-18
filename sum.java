import java.util.*;
public class sum {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number nigga: ");
    int n = input.nextInt();
    int result= sum(1, n);
  }
  static int sum(int i, int n){
    if(i>n){
      return 0;
    }
    return i + sum(i+1, n);
  }
}
