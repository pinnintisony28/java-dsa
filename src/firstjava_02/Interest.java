// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package firstjava_02;

import java.util.Scanner;

public class Interest {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    double P=in.nextDouble();
    int T=in.nextInt();
    int R=in.nextInt();
    double SI=(P*T*R)/100;
    System.out.println("Interest is :"+SI);
   } 
}
