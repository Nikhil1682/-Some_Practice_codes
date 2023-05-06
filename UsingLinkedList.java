public class UsingLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }    
    }

    static class queue{
        Node head=null;
        Node tail=null;

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        //no need of full function because linked list is of variable size

        public void add(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                tail=head=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }

        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }

            int front=head.data;
            
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }

            return head.data;
        }

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
