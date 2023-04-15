import java.util.*;

public class transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();

        int Oarr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the elemnt in pocket [" + i + "][" + j + "]");
                Oarr[i][j] = sc.nextInt();
            }
        }

        System.out.println("original Matrix is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Oarr[i][j]+ " ");

            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Oarr[j][i]+ " ");

            }
            System.out.println();
        }

    }
}
