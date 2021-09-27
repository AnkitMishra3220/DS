package Basic;

import java.util.Scanner;

public class PythagoreanTriplet {

   // 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
    //2. Take as input three numbers a, b and c.
    // 3. Print true if they can form a pythagorean triplet and false otherwise.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3){
            if((n1*n1) == ((n2*n2) + (n3*n3))){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }else if (n2>n1 && n2>n3){
            if((n2*n2) == ((n1*n1)+(n3*n3))){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }else {
            if((n3*n3) == ((n1*n1)+(n2*n2))){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


        }

    }
}
