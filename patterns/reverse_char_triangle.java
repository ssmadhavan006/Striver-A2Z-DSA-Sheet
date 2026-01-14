//Reverse Character Triangle Pattern
package patterns;
public class reverse_char_triangle {
        public void pattern15(int n) {
        for(int i=0;i<n;i++){
            for(char ch ='A'; ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        reverse_char_triangle s = new reverse_char_triangle();
        s.pattern15(n);
        in.close();
    }
}
