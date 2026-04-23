package conditional_loops_03;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number:");
        int val=in.nextInt();
        int sum=0;
        for (int i=1;i<=val;i++){
             sum=sum+i;

        }System.out.println("Sum ="+sum);
    }
}
