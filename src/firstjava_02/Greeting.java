// Take name as input and print a greeting message for that particular name.

package firstjava_02;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String name=in.next();
      System.out.println("Good Morning " +name);
   
   }
}
