/* C++ Program to print the sum of elements in the Zigzag sequence in a given matrix */
#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  cin>>r>>c;
  int ar[r][c];
  for(i=1;i<=r;i++)
    for(j=1;j<=c;j++)
      cin>>ar[i][j];
  i=1;
  for(j=1;j<=c;j++)
    sum+=ar[i][j];
  for(i=2;i<r;i++)
  {
    j=c-i+1;
    sum+=ar[i][j];
  }
  i=r;
  for(j=1;j<=c;j++)
    sum+=ar[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}
