#include<iostream>
using namespace std;
int main()
{
  int ar[20],n,a,ch,m,temp;
  cin>>n;
  for( int i=0;i<n;i++)
    cin>>ar[i];
  cin>>a>>ch;
  
  for(int i=0;i<=n;i++)
  {
    if(i==a-1)
    {
      temp=ar[i];
      ar[i]=ch;
    }
    if(i>=a)
    {
     m=ar[i];
      ar[i]=temp;
      temp=m;
    }
  }
  
  cout<<"Enter the number of elements in the array";
  cout<<"\nEnter the elements in the array";
  cout<<"\nEnter the location where you wish to insert an element";
  if(a>n)
    cout<<"\nInvalid Input";
  else{
  cout<<"\nEnter the value to insert";
   cout<<"\nArray after insertion is\n";
   for(int i=0;i<=n;i++)
     cout<<ar[i]<<"\n";
  }
}