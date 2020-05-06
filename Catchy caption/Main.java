#include <cstring>
#include <iostream>
#include<string>
using namespace std;
int main()
{
   string a;
  getline(cin,a);
  int x=a.size();
  if(x<50)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}