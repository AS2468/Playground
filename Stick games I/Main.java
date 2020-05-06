#include<iostream>
using namespace std;
void print(int a)
{
  if(a==1)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  int n,m,a;
  cin>>n>>m;
  if(n%2==0)
    a=1;
  else
    a=0;
  print(a);
}