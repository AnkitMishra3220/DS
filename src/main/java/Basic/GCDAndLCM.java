package Basic;

import java.util.Scanner;

public class GCDAndLCM {

//    1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
//    2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
//    3. Take input "num1" and "num2" as the two numbers.
//    4. Print their GCD and LCM.
// input = 36,24 output = 12 , 72

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int onum1 = num1;
        int onum2 = num2;
        while (num1 % num2!=0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (onum1*onum2)/gcd;
        System.out.println("GCD :" +num2);
        System.out.println("LCM :" +lcm);
    }
}
