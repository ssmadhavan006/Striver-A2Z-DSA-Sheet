package patterns;
import java.util.Scanner;

class right_triangle_star {
    public void pattern2(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        right_triangle_star s = new right_triangle_star();
        s.pattern2(n);
        in.close();
    }
}