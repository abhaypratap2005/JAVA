import java.util.Scanner;

public class Y_10_Arrays {
    public static void main(String args[]) {
        // int[] marks= new int[3];
        // marks[0]=89;
        // marks[1]=98;
        // marks[2]=89;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for( int i =0;i<3;i++){
        // System.out.println(marks[i]);
        // }
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
            sc.close();
        }

    }
}