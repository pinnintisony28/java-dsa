package conditional_loops_03;

import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter letter:");  
      char l=in.next().charAt(0);
      if (l=='a' || l=='e' || l=='i'|| l=='o'|| l=='u')
      {
        System.out.println("Vowel");
      }else{
        System.out.println("Constant");
      }
    }}
