package conditional_loops_03;
import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Principal Amount :");
        int pm=in.nextInt();
        System.out.print("Enter interest :");
        int r=in.nextInt();
        System.out.print("Enter Time :");
        int t=in.nextInt();
        double amount=pm*Math.pow((1+r/100.0),t);
        System.out.println("Amount :"+amount);
        double CI=amount-pm;
        System.out.println("CI :"+CI);


    }
}
