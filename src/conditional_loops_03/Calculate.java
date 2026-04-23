package conditional_loops_03;

import java.util.Scanner;

public class Calculate {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Total Marks :");
        int total=in.nextInt();
        System.out.print("No. of subjects : ");
        int no=in.nextInt();
        double avg=total/no;
        System.out.println("Avg = "+avg);
    }
}
