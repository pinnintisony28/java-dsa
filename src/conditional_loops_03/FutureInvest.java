package conditional_loops_03;
import java.util.Scanner;
public class FutureInvest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Initial Amount:");
        int amount=in.nextInt();
        System.out.print("Enter Interest:");
        int r=in.nextInt();
        System.out.print("Enter time period:");
        int t=in.nextInt();
        double pow=Math.pow((1+r/100.0),t);
        double FV=amount*pow;
        System.out.println("FV:"+FV);

    }
}
