#include<iostream>
using namespace std;

int main()
{
  int a,b,i,j;
  cin>>a>>b;
  int ar[a][b],ar1[a][b],ar2[a][b];
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      cin>>ar[i][j];
  }
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      cin>>ar1[i][j];
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      ar2[i][j]=ar[i][j]+ar1[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      cout<<ar2[i][j]<<" ";
    }
    cout<<"\n";
  }
}
