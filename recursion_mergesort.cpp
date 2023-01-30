#include<iostream>

using namespace std; 
int merge(int arr[],int s,int e){
   int mid=s+(e-s)/2;

   int len1=mid-s+1;
   int len2=e-mid;

   int *first=new int[len1];
   int*second=new int[len2];   //creating

   ///copy values

   int main_arr_index=s;
   for(int i=0;i<len1;i++){
     first[i]=arr[main_arr_index++];
   }
    main_arr_index=mid+1;
   for(int i=0;i<len2;i++){
     second[i]=arr[main_arr_index++];
   }

   //merge both arrays

   int index1=0;
   int index2=0;
   main_arr_index=s;

   while(index1<len1 && index2<len2){
    if(first[index1]<second[index2]){
        arr[main_arr_index++]=first[index1++];
    }
    else{
        arr[main_arr_index++]=second[index2++];
    }
   }
   while(index1<len1){
    arr[main_arr_index++]=first[index1++];
   }
   while(index2<len2){
    arr[main_arr_index++]=second[index2++];
   }

}
int merge_sort(int arr[],int s, int e){
   if(s>=e){
    return 0; //base case
   }
   int mid=s+(e-s)/2;
   merge_sort(arr,s,mid); ///left part 
   merge_sort(arr,mid+1,e); //right part
   merge(arr,s,e);  //merge
}
int main(){
    int arr[8]={3,5,8,4,2,1,9,34};
    int n=8;
    merge_sort(arr,0,n-1); // passing start end
    for(int i=0;i<n;i++){   //printing
        cout<<arr[i]<<" ";

    }
    return 0;
}