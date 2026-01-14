//Increasing Number Triangle Pattern
package patterns;
import java.util.Scanner;
public class increase_number_triangle {
    public static void pattern13(int n) {
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num + 1;
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern13(n);
        in.close();
    }
   
}
