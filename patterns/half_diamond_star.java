// Half Diamond Star Pattern
package patterns;
import java.util.Scanner;
public class half_diamond_star {
    public static void pattern10(int n) {
        for(int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i > n) stars = 2*n - i;
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern10(n);
        in.close();
    }
}
