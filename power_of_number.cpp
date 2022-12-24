#include<iostream>
 #include<math.h>
 
 using namespace std; 
 int power(int a ,int b){
     int number=1;
     for(int i=1; i<=b;i++){
         number=number*a;
     }
     return number;
 }
 
 int main(){
     int a,b;
     cout<<"enter the num1"<<endl;
     cin>>a;
      cout<<"enter the num2"<<endl;
     cin>>b;
     int ans=power(a,b);
     cout<<ans;
     return 0;
 }