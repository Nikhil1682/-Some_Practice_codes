import java .util.*;
public class  Arrays{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        String []array=new String[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i]=sc.next();

        }
        for(int i=0;i<array.length;i++){
            System.out.println("the name " + (i+1) +" is "+ array[i]);


        }

        
    }

}


