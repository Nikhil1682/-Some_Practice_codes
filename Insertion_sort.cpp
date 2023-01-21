#include<iostream>

using namespace std; 
void print_array(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
void insertion_sort(int arr[], int n){
    for(int i=1;i<n;i++){ // asssume 1 element already sorted
        int temp=arr[i];
        int j=i-1;
        for(;j>=0;j--){
            if(arr[j]>temp){
                arr[j+1]=arr[j];       
            }
            else{
                break;
            }
        }
        arr[j+1]=temp;
    }
}
int main(){
    cout<<"sorted array is: ";
    int arr[6]={8,9,1,7,6,5};
    insertion_sort(arr,6);
    print_array(arr,6);

    return 0;
}