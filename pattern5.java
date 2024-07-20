/* 
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6   Reverse Number 
   4 5 6    Triangle Pattern
    5 6 
     6 
*/

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num = sc.nextInt();

     for(int i=1;i<=num;i++){
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
