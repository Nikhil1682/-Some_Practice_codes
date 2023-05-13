public class LL_Deletion {
    Node head;
    private int size;
    LL_Deletion(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }

        head=head.next;
        size--;


    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
         size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondlastNode=head;
        Node lastnode=head.next;

        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlastNode=secondlastNode.next;

        }

        secondlastNode.next=null;

    }

    public int getsize(){
        return size;
    }

    public void print(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;    
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LL_Deletion list=new LL_Deletion();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.addlast(6);
        System.out.println("Original list");
        list.print();
        list.deleteFirst();
        System.out.println("First element deleted");
        list.print();
        list.deleteLast();
        System.out.println("Last element deleted");
        list.print();
        System.out.println("Size of Linked List is "+list.getsize());

    }
}
