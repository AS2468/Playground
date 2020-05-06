#include<iostream>
using namespace std;
#include<string>
int main()
{
  //Type your code here.
  string str1,str2;char str3[100];
  getline(cin,str1);
  getline(cin,str2);
  int a,b,i,j;
  a=str1.size();
  for(i=0,j=a-1;j>=0,i<a;j--,i++)
    str3[i]=str1[j];
 if(str3==str2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}