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
  max=ar[0][0];
  for(i=0;i<r;i++)
  {
    
    for(j=0;j<c;j++)
    {
      if(ar[i][j]>max)
        max=ar[i][j];
    }
    
  }
  cout<<"The maximum element is "<<max;
}