// Take integer inputs till the user enters 0 and print the largest number from all.

package conditional_loops_03;

import java.util.Scanner;

public class Largest0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=in.nextInt();
        int max=n;
        while(n!=0){
            System.out.print("Enter a number:");
             n=in.nextInt();
            if(n>max){
                 max=n;
            }
        }
        System.out.println("Largest is:"+max);
    }
}
