package conditional_loops_03;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double result=a*b;
        System.out.println("Area of Rectangle :"+result);
    }
}
