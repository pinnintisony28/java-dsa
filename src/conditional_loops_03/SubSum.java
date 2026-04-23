// Subtract the Product and Sum of Digits of an Integer

package conditional_loops_03;
import java.util.Scanner;
public class SubSum {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value :");
        int val=in.nextInt();
        int sum=0;
        int product=1;
        while(val!=0){
            int r=val%10;
            // System.out.println(r);
             sum=sum+r;
             product=product*r;
             val=val/10;
        }System.out.println("sum :"+sum);
        System.out.println("product :"+product);
        System.out.println("Result : "+(product-sum));



    }
}
