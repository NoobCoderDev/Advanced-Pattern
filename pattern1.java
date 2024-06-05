/*  draw the pattern
**********
**** **** 
***  ***  
**   **   
*    *    
*    *    
**   **   
***  ***  
**** **** 
**********
 */

import java.util.Scanner;

public class pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        //First Half
       for(int i=0;i<number;i++){
        for(int j=0;j<number-i;j++){
            System.out.print("*");
        }
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<number-i;j++){
            System.out.print("*");
        }
        System.out.println();
       }

       //Second Half
       for(int i=0;i<number;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        for(int j=0;j<number-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}