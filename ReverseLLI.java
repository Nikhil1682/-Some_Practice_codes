public class ReverseLLI{
    Node head;
    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addlast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void IteravtiveReverse(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;

            prevNode=currentNode;
            currentNode=nextNode;

        }

        head.next=null;
        head=prevNode;
    }

    public void  print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    public static void main(String[] args) {
        ReverseLLI list = new ReverseLLI();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.print();
        System.out.println("After Reverse");
        list.IteravtiveReverse();
        list.print();
        

    }

}