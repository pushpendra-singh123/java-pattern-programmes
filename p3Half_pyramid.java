public class p3Half_pyramid {
    public static void main(String[] args) {
        int n = 4 ;//,m = 5;
        for(int i=1; i<=n; i++){
            // for(int j=1;j<=m;j++){
                // if(j<=i){
                    // System.out.print("*");
                // }
                // else{
                //      System.out.print("");
                // }
            // }


            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
