#include<iostream>
using namespace std;
int printresult(int *a,int n,int s)
{
int sum=0,i;
  for(i=0;i<n;i++)
  {
    sum+=*(a+i);
  }
  if(sum<=s)
    return 1;
  else 
    return 0;
}
  
int main()
{
	int n,s,i;
  cin>>n>>s;
  int ar[n];
  for(i=0;i<n;i++)
    cin>>ar[i];
  if(printresult(ar,n,s))
    cout<<"YES";
  else
    cout<<"NO";
}