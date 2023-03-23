import java.util.*;
public class gcd_LCM {

    public static void gcd_LCM(int n1,int n2){
        int gcd=1;
        int min=(n1>n2)?n2:n1;       // if first number is large
        for(int i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0){
            gcd=i;
            }
        }
        System.out.println("GCD is two numbers is: "+gcd );
        System.out.println("LCM of two number is: "+(n1*n2)/gcd);

    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter Second number");
        int n2=sc.nextInt();

        gcd_LCM(n1,n2);

    }
}
