//Number Crown Pattern
package patterns;
import java.util.Scanner;

public class num_crown {
    public static void pattern12(int n) {
        for(int i=1;i<=n;i++){
            // Print ascending numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // Calculate and print spaces (decreases each row)
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // Print descending numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern12(n);
        in.close();
    }
}
