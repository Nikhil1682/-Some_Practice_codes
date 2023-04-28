public class MoveAll_I {

    public static void moveALL(String str,int i,int count,String newString){
        if(i==str.length()){
            for(int in=0;in<count;in++){
                newString+='i';
            }
            System.out.println(newString);
            return;
        }

        char currchar=str.charAt(i);
        if(currchar=='i'){
            count++;
            moveALL(str,i+1,count,newString);
        }
        else{
            newString+=currchar;
            moveALL(str,i+1,count,newString);   
        }
    }
    public static void main(String[] args) {
        String str="Nikhil";
        moveALL(str,0,0,"");

    }
    
}
