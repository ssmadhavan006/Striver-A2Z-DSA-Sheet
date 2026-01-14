//Character Increasing Triangle Pattern
package patterns;
import java.util.Scanner;
public class char_increase_triangle {
    public static void pattern14(int n) {
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern14(n);
        in.close();
    }
}
