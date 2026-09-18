import java.util.*;
public class input {
    public static void main(String args[]){
        System.out.println("Hello everyone we will take all types of input");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = inp.next();
        System.out.println("Enter your age");
        int age = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter your hobies");
        String hobies = inp.nextLine();
        System.out.println("Hello "+ Name +" your age is "+ age +" and your hobies is "+ hobies);
        inp.close();
    }
}