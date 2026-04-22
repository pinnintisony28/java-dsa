package conditional_loops_03;
import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value:");
        int value=in.nextInt();
        System.out.print("Enter power:");
        int power=in.nextInt();
        double res=Math.pow(value,power);
        System.out.println("Answer:"+res);

    }
}
