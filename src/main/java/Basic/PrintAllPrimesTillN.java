package Basic;

import java.util.Scanner;

public class PrintAllPrimesTillN {

   // 1. You've to print all prime numbers between a range.
    // 2. Take as input "low", the lower limit of range.
   //3. Take as input "high", the higher limit of range.
   //4. For the range print all the primes numbers between low and high (both included).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i=low;i<=high;i++){
            boolean isPrime = true;
            for (int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }


        }


    }
}
