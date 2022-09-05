#include<iostream>

using namespace std; 

class Node{
    public:
    int data;
    Node* next;

//constructor

Node(int d){
    this->data=d;
    this->next=NULL;
}

//destructor

~Node(){
    int value=this->data;
    if(this->next!=NULL){
        delete next;
        next=NULL;
    }
    cout<<"Memory is free for node with data"<<value<<endl;
}

};

//no neeed of head in circular linked list

void insertatnode(Node* &tail,int element,int d){
    // empty list
    if(tail==NULL){
        Node* newnode=new Node(d);
        tail=newnode;
        newnode->next=newnode;
    }
    else{

    // assuming that elemetn is present in the list
    //non-empty list

    Node *curr=tail;
    while(curr->data!=element){
        curr=curr->next;
    }

    //element found

    Node* temp=new Node(d);
    temp->next=curr->next;
    curr->next=temp;
    }
}

void print(Node* tail){
    Node* temp=tail;
    if(tail==NULL){
        cout<<"list is empty"<<endl;
        return;
    }

    //using of do while bcs we want one condition must be run

    do{
        cout<<tail->data<<" ";
        tail=tail->next;
    }while(tail!=temp);
    cout<<endl;

}

void deletenode( Node* &tail,int value){
    if(tail==NULL){
        cout<<"list is empty"<<endl;
        return;
    }
    else{
        //non-empty
        //asssuming that value is present im linked list
        Node* prev=tail;
        Node* curr=prev->next;

        while(curr->data!=value){
            prev=curr;
            curr=curr->next;

        }

        prev->next=curr->next;
        //1 linked list means
        if(curr==prev){
            tail=NULL;
        }

        //2 or more linked list
        if(tail==curr){
            tail=prev;
        }
        curr->next=NULL;
        delete curr;
    }
}

int main(){
    Node* tail=NULL;

    // insertatnode(tail,5,3) ;   //no need of element here
    // print(tail);
    // insertatnode(tail,3,5);   //here the use of element is used
    // print(tail);
    // insertatnode(tail,5,7) ;   // means 3 ke bad  7 lgadoooo
    // print(tail);
    // insertatnode(tail,7,9) ;  // 7 ke bad 3
    // print(tail);
    // /deletenode(tail,3);    //7 is deleted
    print(tail);
    // print(tail);

    return 0;
}