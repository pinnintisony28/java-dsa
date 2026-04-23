package conditional_loops_03;
import java.util.Scanner;
public class Arm {
    
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter value :");
    int val=in.nextInt();
    double cube=0;
    int original=val;
    while(val!=0){
        int ld=val%10;
        // System.out.println(ld);
        val=val/10;
        cube=cube+Math.pow(ld,3);
    }
    // System.out.println(cube);x
//    int cube1=(int)(cube);
     if(original == (int)(cube)){
        System.out.print("Arm Strong ");
     }else
     {
        System.out.print("Not a Arm Strong");
     }


}    
}
w