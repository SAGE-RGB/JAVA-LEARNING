public class pattern2 {
    public static void main(String[] args) {
        //butterfly pattern 
        int n = 5 ;
        //upperhalf
        for ( int i = 1 ; i <= n ; i++){
            //1 part star 
            for ( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            // spaces 
            int spaces = 2*(n-i); 
            for ( int j=1 ; j <=spaces ; j++){
                System.out.print(" ");
            }
            // 2 part star  
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half 
        for ( int i = n ; i >= 1 ; i--){
            //1 part star 
            for ( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            // spaces 
            int spaces = 2*(n-i); 
            for ( int j=1 ; j <=spaces ; j++){
                System.out.print(" ");
            }
            // 2 part star  
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //solid rhombus 
        for ( int i = 1 ; i <=n ; i++){
            //spaces
            int spaces = n-i ; 
            for( int j = 1 ; j<= spaces ; j++){
                System.out.print(" ");
            }
            //stars 
            for( int j = 1 ; j<= 5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // number triangle 
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers ->print row no, row no times
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //palindromic 
        for ( int i = 1 ; i <= n ; i++){
            for ( int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for ( int j = i ; j>=1; j--){
                System.out.print(j);
            }
            for ( int j = 2 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println(); 
        }
        //diamond
        // upper half 
        for( int i = 1 ; i <=n ; i ++){
            for ( int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lowerhalf
        for( int i = n ; i >=1 ; i--){
            for ( int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
