import java.util.*;
public class p1RectanglePattern {
    public static void main(String[] args) {
        // for(int i=1; i<=4; i++){    // i for rows and j for colomns.
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // taking input from user
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter no. of colomns.: ");
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){    // i for rows and j for colomns.
            for(int j=1; j<=m; j++){
                // System.out.print("*");

                System.out.print(j+96);
            }
            System.out.println();
        }
        sc.close();
    }
}
