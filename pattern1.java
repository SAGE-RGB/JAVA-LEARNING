public class pattern1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 11 ;
        int  number = 1 ; 
        System.out.println();
        //rectangle
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        //hoollow reactangle
        for (int i=1; i<=n ; i ++){
            for(int j = 1 ; j<=m; j++){
                if (i==1||j==1||i==n||j==m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //half pyramid
        for ( int i=1 ; i<=n; i++){
            for (int j= 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        //inverted half pyramid 
        for(int i = n ; i>=1 ; i-- ){
            for ( int j= 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // inverted half pyramid 180 deg
        for (int i = 1 ; i<=n ; i ++ ){
            //spaces
            for ( int j = 1 ; j<= n-i ; j ++){
                System.out.print(" ");
            }
            //stars 
            for ( int j = 1 ; j<= i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //half pyramid with no.
        for ( int i = 1 ; i <= n ; i ++){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        //inverted pyramid with no. 
        for( int i=1 ; i<=n; i++){
            for (int j = 1 ; j<= n-i+1 ;  j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        //floyd's triangle
        for ( int i = 1 ; i <=n ; i++ ){
            for ( int j = 1 ; j<=i; j++){
                System.out.print(number +" ");
                number++ ;
            }
            System.out.println();
        }
        System.out.println();
        //0-1 triangle 
        for ( int i = 1 ; i <= n ; i++){
            for ( int j = 1 ; j<=i ; j++){
                int sum = i+j;
                if ( sum % 2 == 0 ){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
