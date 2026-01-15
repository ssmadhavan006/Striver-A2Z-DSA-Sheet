package basic_maths;

public class count_digits {
    static int countDigits(int n) {
        // code here
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }   
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countDigits(n));
        in.close();
    }
}
