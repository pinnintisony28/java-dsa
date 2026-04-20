// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package firstjava_02;
import java.util.*;
public class calculator {
    public static void main(String[] args){
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("Enter ur choice:");
        Scanner in =new Scanner(System.in);
        int ch=in.nextInt();
        System.out.println("Enter 2 values");
        int a=in.nextInt();
        int b=in.nextInt();
        int result;

        if (ch==1){
          result=a+b;   
        }
        else if(ch==2){
            result=a-b;
        }else if(ch==3){
            result=a/b;
        }
        else{
            result=a*b;
        }
        
    System.out.println(result);
    }
}
