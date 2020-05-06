#include<iostream>
using namespace std;
int fun(int n,int *a)
{
  int odd=0,even=0,i;
  for( i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
      even=1;
    else
      odd=1;
  }
  
    if(even==1 &&odd==0)
      return 1;
    if(odd==1 && even ==0)
      return 2;
    if(odd==1 && even ==1)
      return 3;
  
}
int main()
{
 int n,i;
  cin>>n;
  int ar[n];
  for(i=0;i<n;i++)
    cin>>ar[i];
  int m=fun(n,ar);
  cout<<"Enter the number of elements in the array";
  cout<<"\nEnter the elements in the array\n";
  if(m==1)
    cout<<"The array is Even";
  else if(m==2)
    cout<<"The array is Odd";
  else 
    cout<<"The array is Mixed";
}