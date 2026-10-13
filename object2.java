public class object2 {
  public static void main(String[] args) {
    employee e1 = new employee("Shantanu", 40000);
    e1.annualSalary();
  }
  
}
class employee{
  String name;
  int salary;
  employee(String name, int salary){
    this.name=name;
    this.salary=salary;
  }
  void annualSalary(){
    System.out.println(name + " hey your annual salry is " + salary*12);
    return;
  }
}
