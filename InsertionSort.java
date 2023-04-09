import java.util.*;
public class InsertionSort {
  public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
  }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //insertion
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-15;  //last index of sorted array
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }
         printArray(arr);
    }
    
}
