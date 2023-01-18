#include<iostream>

using namespace std; 
int binary_search(int arr[],int size,int key){
    int start=0;
    int end=size-1;
    int mid=start+(end-start)/2 ;  // (s+e)/2  we use bcs this formula may be cross the range of integer
    while(start<=end){
        if(arr[mid]==key){
           return mid;
        }
        if(key>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=start+(end-start)/2;
    }
    return -1;
}
int main(){
    int arr[6]={2,4,6,8,10,12};
    int done= binary_search(arr,6,2);
    cout<<"index of key is: "<<done;

    return 0;
}