#include<iostream>

using namespace std; 
long long int squareroot(int n){
 int s=0;
 int e=n;
 long long int mid=s+(e-s)/2;
int ans=-1;
 while(s<=e){
    long long int square=mid*mid;
    if(square==n){
        return mid;
    }
    else if(square<n){
        ans=mid;
        s=mid+1;
    }
    else{
        e=mid-1;
    }
    mid=s+(e-s)/2;
 }
return ans;
}
//double is used to find exact value of squarerrot
double morePrecision(int n, int precision,int temp_sol ){
double factor =1;
double ans=temp_sol;
for(int i=0; i<precision;i++){
    factor=factor/10;
    for(double j=ans;j*j<n;j=j+factor){
        ans=j;
    }
}
return ans;
}
int main(){
    int n;
    cout<<"enter the number"<<endl;
    cin>>n;
    int temp_sol=squareroot(n);
   cout<<"answer is "<<morePrecision(n,3,temp_sol)<<endl;

   //cout<<temp_sol;
    return 0;
}