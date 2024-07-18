/*

*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***        Butterfly pattern
**        **
*          *

*/
import java.util.Scanner;
public class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        // First Part
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second part
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
