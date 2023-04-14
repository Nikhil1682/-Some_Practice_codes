import java.util.*;

public class spiralPrint {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m = sc.nextInt();
        System.out.println("enter the number of columns ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the number in pocket [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }
        // output
        System.out.println("the matrix is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //spiral output
        System.out.println("matrix in spiral form");
        int row = 0, col = 0;
        while (row < m && col < n) {
            for (int i = col; i < n; i++) {
                System.out.print(arr[row][i] + " ");
            }
            row++;

            for (int i = row; i < m; i++) {
                System.out.print(arr[i][n - 1]+ " ");
            }
            n--;
            if (row < m) {
                for (int i = n - 1; i >=col; i--) {
                        System.out.print(arr[m-1][i]+ " ");
                }
                m--;

            }
            if(col<n){
                for(int i=m-1;i>=row;i--){
                    System.out.print(arr[i][col]+ " ");
                }
                col++;
            }
        }
    }
}
