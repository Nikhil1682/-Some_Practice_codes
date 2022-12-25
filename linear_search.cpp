#include<iostream>

using namespace std; 
bool linear_search(int arr[],int size,int key){
    for(int i=0;i<size;i++){
        if(arr[i]==key){
            return 1;
        }
    }
    return 0;
}

int main(){
    int arr[5]={3,5,7,8,6};
    int key; //want to search
    cout<<"enter thr element you want to search"<<endl;
    cin>>key;
    bool found=linear_search(arr,5,key);
    if(found){
        cout<<"element is Present"<<endl;
        
    }
    else{
        cout<<"element is not present"<<endl;
    }
    return 0;
}   