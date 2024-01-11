import java.util.Scanner;

public class Y_07_functions {
    // public static int calculateSum(int a, int b){
    //    int sum = a +b;
    //     return sum ;
    // }
    public static void PrintFactorial(int n){
        if (n<0){
            System.out.println("INVALID");
            return ;
        }
        int Factorial = 1;
        for(int i=n; i>=1;i--){
                Factorial= Factorial*i;
        }
        System.out.println(Factorial);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateProduct(a,b);
        // System.out.println("sum of theseis" +sum);
        // sc.close();
        int n = sc.nextInt();
        sc.close();

        PrintFactorial(n);


       
    }
}  
