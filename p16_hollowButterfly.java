import java.util.Scanner;

public class p16_hollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n =sc.nextInt();
        // for upper half.
        sc.close();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }  
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //for lower half part.
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }  
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
