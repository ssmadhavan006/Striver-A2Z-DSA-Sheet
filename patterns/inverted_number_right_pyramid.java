//right inverted number pyramid  pattern
package patterns;
import java.util.Scanner;

class inverted_number_right_pyramid{
    public void pattern5(int n) {
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        inverted_number_right_pyramid s = new inverted_number_right_pyramid();
        s.pattern5(n);
        in.close();
    }
}
