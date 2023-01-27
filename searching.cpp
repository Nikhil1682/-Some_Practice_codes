#include<iostream>

using namespace std; ///need to give column 
bool isPresent(int arr[][4],int target , int i,int j){
for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            if(arr[i][j]==target){
                return 1;
            }
           
        }
    }
     return 0;
}
int main(){
    int arr[3][4];
    // for input
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            cin>>arr[i][j];
        }
    }
    //for output
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            cout<<arr[i][j]<<" "; 
        }
        cout<<endl;  ///necesssary
    }
    cout<<endl;
    cout<<"enter the search element:"<<endl;
    int target;
    cin>>target;
    if(isPresent(arr,target,3,4)){
        cout<<"found"<<endl;
    }
    else{
        cout<<"not found"<<endl;
    }


    return 0;
}