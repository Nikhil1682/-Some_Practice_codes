import java.util.*;
public class ReverseString {

    public static void PrintRev(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
      System.out.print(str.charAt(index));
      PrintRev(str,index-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.nextLine();
        System.out.println("Reverse String is : ");

        PrintRev(str,str.length()-1);

    }
}
