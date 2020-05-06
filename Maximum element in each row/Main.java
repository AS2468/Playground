#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int ar[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>ar[i][j];
  }
  for(i=0;i<r;i++)
  {
    int max=ar[i][0];
    for(j=0;j<c;j++)
    {
      if(ar[i][j]>max)
        max=ar[i][j];
    }
    cout<<max<<"\n";
  }
}