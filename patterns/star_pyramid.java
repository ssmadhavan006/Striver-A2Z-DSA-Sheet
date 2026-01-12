//right inverted pyramid star pattern
package patterns;
import java.util.Scanner;

class star_pyramid{
    public void pattern5(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        star_pyramid s = new star_pyramid();
        s.pattern5(n);
        in.close();
    }
}
