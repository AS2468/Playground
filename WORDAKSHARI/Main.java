#include<iostream>
using namespace std;
#include<string>
int main()
{
  string a,b;
  getline(cin,a);
  cout<<a;
  getline(cin,b);
  
  while(b.front()!='#' && a.back()==b.front() )
  {
    cout<<"\n"<<b;
    a=b;
    getline(cin,b);
  }
  
  
  
  
    
      
}