//Alphabet Triangle Pattern
package patterns;
public class alpha_triangle {
        public void pattern18(int N) {
        // Loop for each row
        for (int i = 0; i < N; i++) {
            // Print characters from ('A' + N - 1 - i) to ('A' + N - 1)
            for (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        alpha_triangle s = new alpha_triangle();
        s.pattern18(n);
        in.close();
    }
}
