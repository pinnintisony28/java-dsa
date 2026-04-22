package conditional_loops_03;
import java.util.*;

public class Electric {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter units consumed:");
        int units=in.nextInt();
        double bill=0;
        double totalBill;
        double fixed_charge=100;
        if(units<=100){
            bill=units*2;
        }else if(units<=200){
            bill=(100*3)+(units-100)*5;
        }else {
            bill=(100*3)+(200*3)+(units-200)*7;
        }
        totalBill=bill+fixed_charge;
        System.out.print("Total Bill :"+totalBill);
    }
}
