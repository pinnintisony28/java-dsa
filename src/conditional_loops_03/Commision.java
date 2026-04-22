package conditional_loops_03;
import java.util.Scanner;
public class Commision {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Total sales:");
        int sales=in.nextInt();
        int commision_rate=12;

        double commision=(commision_rate/100.0)*sales;
        // System.out.println();
        System.out.println("Commision:"+commision);

    }
}
