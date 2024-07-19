/*
     *
    ***
   *****
  *******
 *********
***********
 *********     Diamond Pattern
  *******
   *****
    ***
     *

 */

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        
        // First Part
        for(int i=1;i<num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Part
        for(int i=1;i<num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=num*2-(i*2+1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
