

public class SquareRoot {
    //method 1
    public int mysqrt(int n){
        if(n<2){
            return n;
        }
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    //method 2
    public int mysqrt2(int n){
        if(n<2){
            return n;
        }
        int i=1;
        while(i<=n/i){
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        SquareRoot s = new SquareRoot();
        System.out.println(s.mysqrt(n));
        System.out.println(s.mysqrt2(n));
        in.close();
    }
    
}
