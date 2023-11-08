// Q. print This pattern.
//       1
//      11
//     121
//    1331
//   14541

public class p18_pascalsTriangle {
    
    public static void main(String[] args) {
    int row=5, i, j, space, num;
    for(i=0; i<row; i++){
        for(space=row; space>i; space--){
            System.out.print(" ");
        }
        num=1;
        for(j=0; j<=i; j++){
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
        }
        System.out.print("\n");
    }
    }
}

