package conditional_loops_03;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter x1:");
        int x1=in.nextInt();
        System.out.print("Enter y1:");
        int y1=in.nextInt();
        System.out.print("Enter x2:");
        int x2=in.nextInt();
        System.out.print("Enter y2:");
        int y2=in.nextInt();
        double res=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(res);
    }
}
