package conditional_loops_03;
import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=in.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            // System.out.println(i);
            result=result*i;
        }
        System.out.println("Factorial of "+n+": "+result);
    }
}

