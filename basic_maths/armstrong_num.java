package basic_maths;
public class armstrong_num {
    public boolean isArmstrong(int n) {
        int initial = n;
        int sum = 0;
        while(n>0){
            int last_digit = n%10;
            sum = sum + (last_digit*last_digit*last_digit);
            n = n/10; 
        }
        return sum == initial;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        armstrong_num an = new armstrong_num();
        System.out.println(an.isArmstrong(n));
        in.close();
    }
}