#include<iostream>
using namespace std;
int main()
{
  int i,n,s;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>s;
  for(i=0;i<n;i++)
  {
    if(a[i]==s)
    {
      cout<<"She passed her exam";
      break;
    }
    if(i==n-1)
       cout<<"She failed";
  }
  }