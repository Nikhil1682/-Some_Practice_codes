import java.util.*;
public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        StringBuilder strb=new StringBuilder(str);

        for(int i=0;i<str.length()/2;i++){
            int front=i;
            int back=str.length()-1-i;
           // now filter char

           char frontChar=str.charAt(front);
           char backChar=str.charAt(back);
           
           //now set the char

           strb.setCharAt(front,backChar);
           strb.setCharAt(back,frontChar);

            
        }
        System.out.println("Reverse String: "+ strb);
    }
}
