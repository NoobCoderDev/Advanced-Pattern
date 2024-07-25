/*
* * * * * * 
 *       * 
  *     * 
   *   * 
    * * 
     *    Hollow Hourglass Pattern
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 
 */
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number : ");
        int num = sc.nextInt();
        // First Part
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num-i+1;j++){
                if(j==1 || i==1 || j==num-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Second part
        for(int i=num-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num-i+1;j++){
                if(j==1 || i==1 || j==num-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
