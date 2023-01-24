#include<iostream>

using namespace std; 
class stack{
    public:
    int *arr;
    int size;
    int top;

    stack(int size){
        this->size = size;
        arr= new int[size];
        top=-1;
    }

   void push(int element){
    if(size-top>1){
        top++;
        arr[top]=element;
    }
    else{
        cout<<"stack is overflow"<<endl;
    }
   } 

   void pop(){
    if(top>=0){
        top--;
    }
    else{
        cout<<"stack underflow"<<endl;
    }
   }

   int peak(){
    if(top>=0){
        return arr[top];
    }
    else{
        cout<<"stack is empty"<<endl;
        return -1;
    }
   }

   bool isempty(){
    if(top==-1){
       return true;
    }
    else{
        return false;
    }
   }


};

int main(){

    stack s(6);
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    s.push(6); // stack is overflow

    cout<<s.peak()<<endl;   //6 on top

    s.pop();

    cout<<s.peak()<<endl;   // 5 on top

    if(s.isempty()){
        cout<<"stack is empty"<<endl;
    }
    else{
        cout<<"stack is not empty"<<endl;
    }
    
    return 0;
}