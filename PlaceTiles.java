public class PlaceTiles {
    public static int placeTile(int n, int m){
        if(n==m){
            return 2;   // 2 ways for placement
        }
        if(n<m){
            return 1;   // onlu onne horizontal way
        }

        int horizontalPlacement=placeTile(n-1, m);
        int verticalPlacement=placeTile(n-m, m);

        return horizontalPlacement+verticalPlacement;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println("Total number of ways to place the tiles are: "+placeTile(n, m) );
        
    }
    
}
