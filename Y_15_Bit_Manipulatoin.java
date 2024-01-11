import java.util.Scanner;

public class Y_15_Bit_Manipulatoin {
   
    
    public static void main(String[] args) {
    //     int n= 5;
    //     int pos = 3; 
    //     int bitMask = 1<<pos;
    


    //     if ((bitMask & n) == 0) {
    //         System.out.println("bit was zero");

    //     }
    //     else {
    //         System.out.println("bit was one");
    //     }
    // }
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();

    int n = 5;
    int pos = 1;
    int bitMask = 1<<pos;
    if(oper ==1){
        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
    else{
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    }
    sc.close();
}
}
