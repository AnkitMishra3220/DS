package Basic;

import java.util.Scanner;

public class PrimeNumber {

    //You've to check whether a given number is prime or not.
    // Take a number "t" as input representing count of input numbers to be tested.
    // Take a number "n" as input "t" number of times.
    // For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
    // p.q < (n)^1/2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            boolean isPrime = true;

            for(int j=2;j*j <= n;j++){
                int rem = n % j ;
                if(rem==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }


        }

    }
}
