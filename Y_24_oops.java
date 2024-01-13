class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student{
  String name;
  int age;
  public void printInfo(String name){
    System.out.println(name);
  }
  public void printInfo(int age){
    System.out.println(age);
  }
  public void printInfo(String name, int age){
    System.out.println(name +" "+ age);
  }

// public void printName(){
//     System.out.println(this.age);
//     System.out.println(this.name);
//   }
//   Student(){  //non parametirized constructor
//     System.out.println("constructor called");
//   }
// Student(String name, int age){ //parametirized constructor
//     this.name=name;
//     this.age=age;
// }
// Student(Student s2){ //copy constructor
//     this.name=s2.name;
//     this.age=s2.age;
//}
Student(){}
}


public class Y_24_oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = " ball";
        // pen1.write();
        // Pen pen2 = new Pen();
        // pen2.color= "red";
        // pen2.type="gel";
        // pen1.printColor();
        // pen2.printColor();
        Student s1=new Student();
        s1.name="Abhay";
        s1.age=56;
        //  Student s2= new Student(s1);
        // s2.printName();
        s1.printInfo(s1.name, s1.age);
         
    }
}
