public class PrintSubsequence {

    public static void subsequences(String str,int i,String newstr){

        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
     char currchar=str.charAt(i);
    // choice of curr is to be
    subsequences(str, i+1, newstr+currchar);
    // not to be
    subsequences(str, i+1, newstr);

    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("Here are the subsequences of your string");
        subsequences(str,0,"");
    }
}
