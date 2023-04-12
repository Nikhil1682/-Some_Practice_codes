import java.util.*;
public class checkAscending {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array");

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isAscending=false;
              break;

            }
        }

    if(isAscending){
        System.out.println("yes array is in ascending order");
    }
    else{
        System.out.println("No array is not in ascending order");
    }

       
    }
}
