package conditional_loops_03;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        double volume=(4/3.0)*Math.PI*r*r*r;
        System.out.println("Volume "+volume);
    }
}
