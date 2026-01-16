//Count number of digits in a number
package basic_maths;
public class count_digits {
    //brute force method
    static int countDigits(int n) {
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }  
    //optimal method 
    static int countDigits2(int n){
        int count = (int) Math.log10(n) + 1;
        return count;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countDigits(n));
        System.out.println(countDigits2(n));
        in.close();
    }
}
