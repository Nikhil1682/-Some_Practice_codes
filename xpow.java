public class xpow {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpow=x*power(x,n-1);
        return xpow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        int ans=power(x,n);
        
        System.out.println(ans);
        
    }
}
