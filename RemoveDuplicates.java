public class RemoveDuplicates {

    public static boolean map[]=new boolean[26];// array of true and false

    public static void Remove(String str,int i,String newStr){
      if(i==str.length()){
        System.out.println(newStr);
        return;
      }
        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            Remove(str, i+1, newStr);
        }else{
            newStr+=currchar;
            map[currchar-'a']=true;
            Remove(str, i+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str="bakkksshhiii";
        Remove(str,0,"");
    }
}


