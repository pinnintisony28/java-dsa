package conditional_loops_03;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double b=in.nextDouble();
        double a=in.nextDouble();
         
    double r1=Math.sqrt(4*a*a -b*b);
     double result=(b/4)*r1;
        System.out.println(result);
        System.out.println("Area of an isosceles :"+result);
    }
}
