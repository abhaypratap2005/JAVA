

class Shape{
    public void area(){
        System.out.println("dispplay");
    }
}
class Triangle extends Shape{
   public static void area(int l, int h){      //single inheritance
    System.out.println(1/2*l*h);

   }
}

// class EquiTriangle extends Triangle{
//     public void area(int l, int h){          //multilevel inheritance
//         System.out.println(1/2*l*h);
//     }
// }

class Circle extends Shape{
    public void are(int r){                   //hierarchial inheritance
        System.out.println(3.14*r*r);
    }
}

public class Y_24_inheritance {
public static void main(String[] args) {
       
    }
}
