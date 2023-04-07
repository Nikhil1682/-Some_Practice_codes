import java.util.*;
public class Delete {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='@'){
            break;
        }
        else{
            result+=str.charAt(i);
        }
    }

    System.out.println("updated String: "+ result);
    }
}
