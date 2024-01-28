import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            if(x%4==0){
                System.out.println("North");
            }
            else if(x%2==0 && x%4!=0){
                System.out.println("South");
            }
            else if(x%3==0){
                System.out.println("West");
                
            }
            else{
                System.out.println("East");
            }
        }
		sc.close();
	}
}
