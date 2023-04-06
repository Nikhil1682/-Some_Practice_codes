import java.util.*;
public class replace {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
                
            }
            else{
                result+=str.charAt(i);
            }
        }
        
        System.out.println("Updated String: "+result);
    }
}

// String result=str.replace('e','i');  predefined function