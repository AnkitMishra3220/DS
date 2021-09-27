package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseToAnyBase {

//    1. You are given a number n.
//    2. You are given a base b1. n is a number on base b.
//    3. You are given another base b2.
//    4. You are required to convert the number n of base b1 to a number in base b2.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int f = getAnyBase(n,b1,b2);
    }

    private static int getAnyBase(int n, int b1, int b2) {
        int ans = 0;
        int f = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            f += rem * Math.pow(b1,i);
            n = n/10;
            i++;
        }
        int j = 0;
        while (f>0){
            int rem = f%b2;
            f = f/b2;
            ans += rem * Math.pow(10,i);
            j++;
        }

        return ans;

    }
}
