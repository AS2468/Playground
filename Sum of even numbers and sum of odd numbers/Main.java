#include<iostream>
using namespace std;
int main()
{
  int n,odd=0,even=0;
  cin>>n;
  int ar[n];
  for(int i=0;i<n;i++)
    cin>>ar[i];
  for(int i=0;i<n;i++)
  {
    if(ar[i]%2!=0)
      odd+=ar[i];
    else 
      even+=ar[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\n"<<"The sum of the odd numbers in the array is "<<odd;
}