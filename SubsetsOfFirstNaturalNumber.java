import java.util.*;
public class SubsetsOfFirstNaturalNumber {

    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer>subset){
        if(n==0){  // all elements are done 
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubset(n-1, subset);

        // remove last
        subset.remove(subset.size()-1);
        findSubset(n-1, subset); 

    }
    public static void main(String[] args) {
        ArrayList<Integer>subset=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("the possible subsets are: ");
        findSubset(n,subset);
    }
    
}
