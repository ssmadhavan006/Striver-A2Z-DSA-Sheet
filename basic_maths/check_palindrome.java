package basic_maths;

public class check_palindrom {
    public boolean isPalindrom(int n) {
        int initial = n;
        int reverse = 0;
        while(n>0){
            int last_digit = n%10;
            reverse = (reverse*10) + last_digit;
            n = n/10;
        }
        return reverse == initial;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        check_palindrom cp = new check_palindrom();
        System.out.println(cp.isPalindrom(n));
        in.close();
    }
}
