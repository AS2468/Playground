#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max;
  cin>>r>>c;
  int ar[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>ar[i][j];
  }
  for(j=0;j<c;j++)
  {
    max=ar[0][j];
    for(i=0;i<r;i++)
    {
      if(ar[i][j]>max)
        max=ar[i][j];
    }
    cout<<max<<"\n";
  }
}