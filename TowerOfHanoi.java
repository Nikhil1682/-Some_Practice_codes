import java.util.*;

public class TowerOfHanoi {
    public static void TOH(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println(" Transfer " + n + " from " + src + " to " +dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        TOH(n - 1, src, dest, help);
        System.out.println(" Transfer " + n + " from " + src + " to " +dest);
        //transfer n-1 from helper to dest using src as 'helper'
        TOH(n - 1, help, src, dest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Disks in source");
        int n = sc.nextInt();
        TOH(n, "Source", "Helper", "Destination");
    }
}

