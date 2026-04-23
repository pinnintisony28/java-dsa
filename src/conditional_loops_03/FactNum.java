package conditional_loops_03;
import java.util.Scanner;
public class FactNum {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=in.nextInt();
        System.out.print("Factors :");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                int fact=i;
                System.out.print(" " + fact);
            }
        //   System.out.println("Factors: ");
        }
        
    }
}
