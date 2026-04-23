package conditional_loops_03;
import java.util.Scanner;
public class Reverse {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter a string:");
    String str=in.next();
    String reversed_string=new StringBuilder(str).reverse().toString();
    System.out.println(reversed_string);
   }
    
    

}
