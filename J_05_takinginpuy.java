import java.util.Scanner;

public class J_05_takinginpuy {
    public static void main(String[] args) {
        System.out.println("it works");
        Scanner xsc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = xsc.nextInt();
        System.out.println("enter number 2");
        int b = xsc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);
        xsc.close();

    }
}
