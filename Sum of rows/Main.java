#include<iostream>
using namespace std;
int main()
{
  int i,j,r,c;
  cin>>r>>c;
  int ar[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>ar[i][j];
  for(i=0;i<r;i++)
  {
    int sum=0;
  for(j=0;j<c;j++)
  {
    sum+=ar[i][j];
  }
    cout<<sum<<"\n";
  }  
}