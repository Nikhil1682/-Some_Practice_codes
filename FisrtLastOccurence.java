import java.util.*;
public class FisrtLastOccurence{
    public static int first=-1;
    public static int last=-1;

    public static void findOccurence(String str,int i,char element){
        if(i==str.length()){
            System.out.println("First occurence at index "+ first);
            System.out.println("Last occurence at index "+ last);
            return;
        }

        char currchar=str.charAt(i);
        if(currchar==element){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        findOccurence(str, i+1, element);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("enter the element to check");
        char ele=sc.next().charAt(0);
        findOccurence(str,0,ele);
    }

}