package conditional_loops_03;

import java.util.Scanner;

public class Parallelogram{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double b=in.nextDouble();
        double h=in.nextDouble();
        double result=b*h;
        System.out.println("Parallelogram:"+result);
    }
}