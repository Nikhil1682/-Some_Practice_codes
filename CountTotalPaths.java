public class CountTotalPaths {
    public static int count(int i,int j,int m,int n){
        if(i==n || j==m){
            return 0; //no path
        }
        if(i==n-1 && j==m-1){
            return 1;  // 1 path
        }
        //for downward direction
        int downward=count(i+1,j,m,n);
        // for rigth direction
        int right=count(i,j+1,m,n);
        return downward+right;
    }
    public static void main(String[] args) {
        int n=3,m=3;   //3x3 matrix
       int total=count(0,0,n,m);
       System.out.println("Total possible path are : "+total);
        }
    
}
