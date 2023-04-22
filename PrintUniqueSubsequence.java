import java.util.*;
public class PrintUniqueSubsequence {
        public static void subsequences(String str,int i,String newstr,HashSet<String>set){
    
            if(i==str.length()){
                if(set.contains(newstr)){
                    return;
                }
                else{
                    System.out.println(newstr);
                    set.add(newstr);
                    return;
                }
            }
         char currchar=str.charAt(i);
        // choice of curr is to be
        subsequences(str, i+1, newstr+currchar,set);
        // not to be
        subsequences(str, i+1, newstr,set);
    
        }
        public static void main(String[] args) {
            String str="aaa";
            System.out.println("Here are the Unique subsequences of your string");
            HashSet<String>set=new HashSet<>();
            subsequences(str,0,"",set);
        }
    }
    

