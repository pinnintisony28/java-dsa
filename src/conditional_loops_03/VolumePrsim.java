package conditional_loops_03;
import java.util.*;
public class VolumePrsim {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double l=in.nextDouble();
        double b=in.nextDouble();
        double h=in.nextDouble();
        double volume=l*b*h;
        System.out.println("Volume of prsim:"+volume);
    }
}
