package FunctionAndArray;

import java.util.Scanner;

public class DecimalToAnyBase {

//    1. You are given a decimal number n.
//    2. You are given a base b.
//    3. You are required to convert the number n into its corresponding value in base b.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int f = getConvertedNumber(n,b);
        System.out.println(f);

    }

    public static int getConvertedNumber(int n, int b) {
        int f = 0;
        int i = 0;
        while (n>0){
            int rem = n%b;
            n = n/b;
            f += rem * Math.pow(10,i);
            i++;
        }

        return f;
    }
}
