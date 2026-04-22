package conditional_loops_03;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter original amount :");
        int oa=in.nextInt();
        System.out.print("Depreciation rate:");
        int dr=in.nextInt();
      
        double reduced_amount=(dr/100.0)*oa;
      
        double res=oa-reduced_amount;
        System.out.println("New price"+res);
    }
}
