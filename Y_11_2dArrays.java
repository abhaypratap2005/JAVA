import java.util.Scanner;

public class Y_11_2dArrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];


        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
                System.out.println(numbers[i][j] + " ");

            }
            System.out.println();
        }
   
    sc.close();
}
}

