package Basic;

import java.util.Scanner;

public class DigitsOfANumber {

//    1. You've to display the digits of a number.
//    2. Take as input "n", the number for which digits have to be displayed.
//    3. Print the digits of the number line-wise.
// Input - 65784383
//      6
//      5
//      7
//      8
//      4
//      3
//      8
//      3


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = 0;
        int temp_num = n;

        while (temp_num >0){
            temp_num = temp_num/10;
            digits++;
        }

        while (digits >0){
            int digit = (int) (n/Math.pow(10,digits-1));
            System.out.println(digit);
            n = n % (int)Math.pow(10,digits-1);
            digits--;
        }

    }
}
