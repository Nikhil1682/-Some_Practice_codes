public class LL_Insertion {
    Node head;
    private int size;
    LL_Insertion(){
        this.size=0;
    }

    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

    public int getsize(){
        return size;
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
        LL_Insertion list = new LL_Insertion();
        list.addfirst(2);
        list.addfirst(1);
        list.print();
        list.addlast(3);
        list.addlast(4);
        list.print();
        System.out.println("Size of Linked List is "+ list.getsize());


    }
}