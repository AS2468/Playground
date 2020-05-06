#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j,temp;
  cin>>r>>c;
  int ar[r][c],ar1[c][r];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>ar[i][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
     ar1[j][i]=ar[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      cout<<ar1[i][j]<<" ";cout<<"\n";
  }
      
}