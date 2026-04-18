// Write a program to print whether a number is even or odd, also take input from the user.

package firstjava_02;

import java.util.*;
public class Evenodd {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        in.close();
    }
}


