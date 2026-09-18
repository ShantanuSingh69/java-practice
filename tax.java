public class tax {
    public static void main(String args[]){
        int salary = 350000;
        if(salary == 250000){
            System.out.println("no tax");
        }
        else if(salary >= 250001 && salary <= 500000){
            System.out.println("Tax deducted 5% of your income");

        }
        else if(salary >= 500001 && salary <= 1000000){
            System.out.println("Tax deducted 20% of your income");

        }
        else{
            System.out.println("tax is 30% of your income");
        }

    }
}
