// pattern to print rectangular star pattern
package patterns;

class rectangular_star {
    void pattern1(int n) {
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        rectangular_star obj = new rectangular_star();
        obj.pattern1(5);
    }
}
