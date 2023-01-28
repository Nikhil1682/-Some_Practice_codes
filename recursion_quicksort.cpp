#include<iostream>

using namespace std; 
int partition(int arr[],int s, int e){
    int pivot=arr[s];
    int count=0;
    for(int i=s+1;i<e;i++){
        if(arr[i]<=pivot){
            count++;
        }
    }
    int pivot_index=s+count;
    swap(arr[pivot_index],arr[s]);

    int i=s;
    int j=e;
    while(i<pivot_index && j>pivot_index){
        while(arr[i]<=pivot){
            i++;
        }
        while(arr[j]>=pivot){
            j--;
        }
        
        if(i<pivot_index &&j>pivot_index){
            swap(arr[i++],arr[j--]);
        }
    }

    }
void quick_sort(int arr[],int s,int e){
    //base case
    if(s>=e){
        return;
    }
    int p=partition(arr,s,e);
    quick_sort(arr,s,p-1);    //left part
    quick_sort(arr,p+1,e);   //right part
  }
int main(){
    int arr[8]={3,5,8,4,2,0,9,34};
    int n=8;
    quick_sort(arr,0,n-1); // passing start end
    for(int i=0;i<n;i++){   //printing
        cout<<arr[i]<<" ";

    }cout<<endl;
    return 0;
}