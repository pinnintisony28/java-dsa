// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package conditional_loops_03;
// import java.util
import java.util.Scanner;
public class User0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=in.nextInt();
        int sum=n;
        while(n!=0){
         System.out.print("Enter a number:");
         n=in.nextInt();
          sum=sum+n;
        }

        System.out.println("Sum is :"+sum);
    }
}
