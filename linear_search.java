import java.util.*;
public class Linear_Search {
    public static void main(String[] args){
        System.out.println("Enter the searching elemnt");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int temp=0;
        int arr[]={2,4,5,6,8,7,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){            // in case of string use (arr[i].equals(key))
                System.out.println("Element is present at "+i+" position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Element not found");
        }

    }
}
