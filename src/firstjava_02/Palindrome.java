// To find out whether the given String is Palindrome or not.

package firstjava_02;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        String reverse=new StringBuilder(name).reverse().toString();
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }


    }
}
