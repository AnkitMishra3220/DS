package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseToDecimal {

   // 1. You are given a number n.
    // 2. You are given a base b. n is a number on base b.
    // 3. You are required to convert the number n into its corresponding value in decimal number system.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int f = getValueIndecimal(n, b);
        System.out.println(f);

    }

    private static int getValueIndecimal(int n, int b) {
        int f = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            f += rem * Math.pow(b,i);
            n = n/10;
            i++;
        }
        return f;
    }
}
