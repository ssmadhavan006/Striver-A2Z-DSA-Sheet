//Inverted Star pyramid pattern
package patterns;
import java.util.Scanner;

class inverted_star_pyramid{
    public void pattern5(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        inverted_star_pyramid s = new inverted_star_pyramid();
        s.pattern5(n);
        in.close();
    }
}
