package conditional_loops_03;
import java.util.Scanner;
public class Batting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enetr runs:");
        int runs=in.nextInt();
        System.out.print("Enter no. of times out:");
        int out=in.nextInt();
        double batting_avg=runs/out;
        System.out.print("Batting average:"+batting_avg);
    }
}
