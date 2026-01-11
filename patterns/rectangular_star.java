//Rectangular Star Pattern
package patterns;
import java.util.Scanner;
class rectangular_star {
    void pattern1(int n) {
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        rectangular_star obj = new rectangular_star();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        obj.pattern1(n);
    }
}
