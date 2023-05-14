import java.util.*;
public class LL_Collections {
    public static void main(String[] args) {
        LinkedList<Integer>List=new LinkedList<>();

        List.addFirst(1);
        List.add(2);
        List.add(2);
        List.add(4);
        List.addLast(5);
        System.out.println("Original linked list is");

        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"->");
        }
        System.out.println("NULL");

        System.out.println("Size of linked list is "+List.size());

        List.removeFirst();
        List.removeLast();
        List.remove(1);
        System.out.println("after deletion");
        System.out.println(List);
        
    }
    
}
