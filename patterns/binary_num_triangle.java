//Binary Number Triangle Pattern
package patterns;
import java.util.Scanner;
public class binary_num_triangle {
    public static void pattern11(int n) {
        for(int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern11(n);
        in.close();
    }
}