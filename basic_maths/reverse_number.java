package basic_maths;

public class reverse_number {
    public int reverseNumber(int n) {
        int reverse=0;
        while(n>0){
            int last_digit = n%10;
            n=n/10;
            reverse=(reverse*10) + last_digit;
        }
        return reverse;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        reverse_number rn = new reverse_number();
        System.out.println(rn.reverseNumber(n));
        in.close();
    }
}
