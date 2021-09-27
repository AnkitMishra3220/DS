package recursion;

import java.util.Scanner;

public class PrintDecreasing {

    public static void printDecreasing(int num){
        if(num==0) return;
        System.out.println(num);
        printDecreasing(num-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        printDecreasing(n);

    }
}
