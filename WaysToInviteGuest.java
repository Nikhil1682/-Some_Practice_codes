import java.util.*;
public class WaysToInviteGuest {

    public static int callguest(int n){
        if(n<=1){
            return 1;  //one way
        }

        int singleWays=callguest(n-1);
        int pairWays=(n-1)*callguest(n-2);
        return singleWays+pairWays;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of guest you want to invite");
        int n=sc.nextInt();
        System.out.println("The total number of ways to invite the guests are  "+callguest(n));
    }
    
}
