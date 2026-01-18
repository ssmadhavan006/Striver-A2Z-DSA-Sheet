package basic_maths;

public class check_prime {
    public static boolean isPrime(int n) {
        // code here
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }
   
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        in.close();
    }
}