package patterns;

public class hollow_rectangle {
        public void pattern21(int n) {
        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print star if it's a border cell
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                // Print space otherwise
                else
                    System.out.print(" ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        hollow_rectangle s = new hollow_rectangle();
        s.pattern21(n);
        in.close();
    }
}
