#include<iostream>
using namespace std; 
void printarray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
void swapalternate(int arr[], int n){
    for(int i=0;i<n;i+=2){   // increament of 2 indexes
        if(i+1<n){
            swap(arr[i],arr[i+1]);
        }
     }
}

int main(){
 int arr[8]={2,3,4,5,6,7,5,6};
 swapalternate(arr,8);
 printarray(arr,8);
    return 0;
}
