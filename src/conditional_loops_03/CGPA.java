package conditional_loops_03;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Maths details (point , credit) :");
        int m1=in.nextInt();
        int m2=in.nextInt();
        System.out.print("Enter Physics details:");
        int p1=in.nextInt();
        int p2=in.nextInt();
        int sum=(m1*m2)+(p1*p2);
        System.out.println(sum);
        double total_credits=m2+p2;
        System.out.println(total_credits);
        double cgpa=sum/total_credits;
        System.out.println("CGPA : "+cgpa);

    }
}
