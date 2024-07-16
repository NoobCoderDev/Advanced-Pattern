/*
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 

 */

import java.util.Scanner;

public class pattern2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int num = sc.nextInt();

    // First Part
    for(int i=1;i<=num;i++){
      for(int j=0;j<num-i;j++){
        System.out.print(" ");
      }
      int k=i;
      for(int j=1;j<=i;j++){
        System.out.print(k);
        k--;
      }
      for(int j=2;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}