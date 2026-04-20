package conditional_loops_03;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius");
        double radius=in.nextDouble();
        double result=(3.14*radius*radius);
        System.out.println("Area of circle is :"+result);
        
    }
}
