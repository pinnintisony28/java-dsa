package conditional_loops_03;
import java.util.*;
public class VolumeCone{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        double h=in.nextDouble();
        
        double volume=(1.0/3)*Math.PI*r*r*h;
        System.out.println("Volume is :"+volume);
    }
}