#include<iostream>
using namespace std;
#include<string>
int main()
{
 string a,b;
  getline(cin,a);
    getline(cin,b);
  int x;
  x=a.find("the");
  while(x>0)
  {
    a.erase(x,4);
    x=a.find("the");
  }
  cout<<a;
}