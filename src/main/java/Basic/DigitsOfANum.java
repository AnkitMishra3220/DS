package Basic;

import java.util.Scanner;

public class DigitsOfANum {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;
        int temp_num = num;

        while(temp_num>0){
            digits++;
            temp_num = temp_num/10;

        }

        temp_num = num;
        while(temp_num>10){
            int div_num = (int)Math.pow(10,digits-1);
            System.out.println(temp_num/div_num);
            temp_num = temp_num % div_num;
            digits--;
        }

        System.out.println(temp_num);



    }
}
