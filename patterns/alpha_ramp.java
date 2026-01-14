package patterns;

public class alpha_ramp {
        public void pattern16(int n) {
        for(int i=0;i<n;i++){
            char ch =(char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        alpha_ramp s = new alpha_ramp();
        s.pattern16(n);
        in.close();
    }
}
