package firstjava_02;
import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter rupees:");
        double money=in.nextDouble();
        double usd;
        usd=money/94;
        System.out.println(usd);
    }
}
