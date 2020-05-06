#include<iostream>
using namespace std;
int main()
{
  int n,s=0,s1=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int temp=a[0];
  for(int i=0;i<n;i++)
  {
    if(i==0)
      cout<<1<<"\n";
    else if(temp>a[i])
    {
      s=1;
      cout<<s<<"\n";
      temp=a[i];
    }
    else
    {
      s1=s1+2;
      cout<<s1<<"\n";
      temp=a[i];
    }
  }
}