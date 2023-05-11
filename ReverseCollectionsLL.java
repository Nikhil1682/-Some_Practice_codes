import java .util.*;
public class ReverseCollectionsLL {
    public static void main(String[] args) {
        LinkedList<Integer>List=new LinkedList<>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.println("Original List is");
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"->");
        }
        System.out.println("NULL");


        Collections.reverse(List);

        
        System.out.println("After Reverse List is");
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"->");
        }
        System.out.println("NULL");

    }
    
}
