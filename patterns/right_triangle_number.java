//Right Triangle Number Pattern
package patterns;
import java.util.Scanner;

public class right_triangle_number {
    public void pattern3(int n) {
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        right_triangle_number s = new right_triangle_number();
        s.pattern3(n);
        in.close();
    }
}
