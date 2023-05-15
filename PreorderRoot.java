public class PreorderRoot{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node Buildtree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }

            Node newnode =new Node(node[idx]);
            newnode.left=Buildtree(node);
            newnode.right=Buildtree(node);

            return newnode;
        }
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.Buildtree(node);
        System.out.println("Root of Tree is "+root.data );

        

    }

}