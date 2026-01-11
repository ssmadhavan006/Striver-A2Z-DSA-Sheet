package patterns;
import java.util.Scanner;

public class right_triangle_number2 {
    public void pattern4(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+"");
                }
            System.out.println();
            }
        }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        right_triangle_number2 s = new right_triangle_number2();
        s.pattern4(n);
        in.close();
    } 
    
}
