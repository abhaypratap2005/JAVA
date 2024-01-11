public class collegejava {
// static void checkAge(int age){
//     if(age<18){
//         throw new ArithmeticException("access denied-you must be 18 years old");
//     }
//     else{
//         System.out.println("Acces granted- you are old enough");
//     }
// }
    

// public static void main(String[] args) {
//         checkAge(19);
//     }
// }
    //     try{
    //         int data = 100/0;

    //     }
    //     catch(ArithmeticException e){ System.out.println(e);}

    //         System.out.println(" rest of the code");
    //     }
    // }
// try{
//     int[] myNumbers = {1, 2, 3, };
//     System.out.println(myNumbers[2]);
// }
// catch(Exception e){
//     System.out.println("something went wrong");
// }
//     }
// }
public static void main(String[] args) {
    

try{
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[0]);
}
catch(Exception e){
    System.out.println("something went wrong");
} finally {
    System.out.println("the try catch is finished");
}
    }
}


