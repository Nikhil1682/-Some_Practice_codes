#include<iostream>

using namespace std; 
char getmax(string s){
    int arr[26]={0};
    int number=0;
    for(int i=0;i<s.length();i++){  
        char ch=s[i];
        if(ch>='a' && ch<='z'){
            number=ch-'a';     
        }
        else{
            number=ch+'A';
        }
     arr[number]++;

    }
     int max=-1,ans=0;
    for(int i=0;i<26;i++){
    
        if(arr[i]>max){
            ans=i;
            max=arr[i];
        }
    }
    char finalans= 'a'+ans;
    return finalans;

}

int main(){
    string s;
    cin>>s;
    cout<<getmax(s);

    return 0;
}