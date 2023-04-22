public class printPermutation {

    public static void printPermutation(String str,String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPermutation(newstr, permutation+currchar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("here are the some permutation combinations");
        printPermutation(str,"");
    }
   

    
}
