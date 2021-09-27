package Basic;

import java.util.Scanner;

public class PrimeFactorisation {

     //  1. You are required to display the prime factorization of a number.
    //  2. Take as input a number n.
    //  3. Print all its prime factors from smallest to largest.
    // input = 1440
    // output = 2 2 2 2 2 3 3 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i*i<=n;i++){
            while ((n%i)==0){
                n = n/i;
                System.out.println(i);
            }
        }

        if(n!=1){
            System.out.println(n);
        }

    }
}
