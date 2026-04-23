package conditional_loops_03;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value:");
        int v=in.nextInt();
        int original=v;
        int reverse=0;
        while(v!=0){
           int r=v%10;
           reverse=reverse*10+r;
           v=v/10;}
        // }    System.out.println(reverse);                                            
          if (original==reverse){
            System.out.println("Palindrome Number");
          }else{
            System.out.println("Not a plaindrome ");
          }
    }
}


