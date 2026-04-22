package conditional_loops_03;


import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double r=in.nextDouble();
        double h=in.nextDouble();
        double volume=Math.PI*r*r*h;
        System.out.println("Cylinder:"+volume);
    }
}
