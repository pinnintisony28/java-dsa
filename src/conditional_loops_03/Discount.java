package conditional_loops_03;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter discount :");
        int dis=in.nextInt();
        System.out.print("Enter money :");
        int money=in.nextInt();
      
        double dis_money=dis/100.0*money;
      
        double res=money-dis_money;
        System.out.println("Total Money:"+res);
    }
}
