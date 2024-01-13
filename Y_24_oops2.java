//  abstract class Animal {
//     abstract public void walk();   
//     public void eat(){
//         System.out.println("Animal eats");
//     }
// }

// class Horse extends Animal {
//     public void walk() {
//         System.out.println("4 legs");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("2 legs");

//  
//   interface Animal{
//     public void walk();
    
//   }
//   class Horse implements Animal{
//     public void walk(){
//         System.out.println("4 legs");
//     }
//   }
class Student{
    String name;
    static String school;
    public static void changeSchool(){
      school= "new school";  
    }
}

public class Y_24_oops2 {
    public static void main(String[] args) {
//    Horse horse = new Horse();
//    horse.walk();
Student.school="vba";
Student student1= new Student();
student1.name= "tony";
// System.out.println(student1.school);
  
    }
}
