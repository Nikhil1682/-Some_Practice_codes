import java.util.*;
public class Max_Min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of array");
        int size=sc.nextInt();

        System.out.println("Enter the elemnts of array");
        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
          
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }

        }

        System.out.println("Largest number in array is: " + max);
        System.out.println("smallest number in array is: " + min);

        


    }
    
}
