/*
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6          Mirror image triangle
    5 6               pattern
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 
 */

import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        //first part
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        //second part
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
