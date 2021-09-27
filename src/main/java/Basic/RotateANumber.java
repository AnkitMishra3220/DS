package Basic;

import java.util.Scanner;

public class RotateANumber {

//    1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//    2. Take as input n and k.
//    3. Print the rotated number.
//    4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056 - 61234005  - 11123400 - 5000000 + 6123400
//    k = 3
//    r = 05612340

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp_num = n;
        int digits = 0;

        while (temp_num > 0) {
            temp_num = temp_num / 10;
            digits++;
        }

        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }

        for (int i = 0; i < k; i++) {
            int rem = n % 10;
            n = n / 10;
            int multiplier = (int) Math.pow(10, digits - 1);
            n = n + (rem * multiplier);
        }
        System.out.println(n);


    }
}
