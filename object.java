public class object{
  public static void main(String[] args) {
    first f = new first("shantanu", 20);
    System.out.println(f.name);
    System.out.println(f.age);
    
  }
}
class first{
    String name;
    int age;
    first(){

    }
    first(String name, int age){
      this.name=name;
      this.age=age;
    }
  }