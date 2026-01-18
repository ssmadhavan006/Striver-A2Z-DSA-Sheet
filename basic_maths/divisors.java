//wrong divisors2
package basic_maths;
import java.util.ArrayList;
import java.util.List;

public class divisors {
    public int[] divisors(int n) {
        int[] divisors = new int[n];
        int index = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i);
            }
        }
        return divisors;
    }
    public static List<Integer> divisors2(int n){
         List<Integer> res = new ArrayList<>();
         for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                res.add(i);
                if(n/i!=1){
                    res.add(n/i);
                } 
            }
        }
        return res;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        divisors div = new divisors();
        div.divisors(n);
        div.divisors2(n);
        in.close();
    }
}
