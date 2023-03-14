import java.util.*;
public class Prime {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){

            if(n%i==0){
                isPrime=false;
                break;
            }

        }

        if(isPrime){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }

    }
}


