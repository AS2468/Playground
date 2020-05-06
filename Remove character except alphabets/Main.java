#include<iostream>
using namespace std;
int main()
{
  char a[50];
  cin.getline(a,50);
  for(int i=0;a[i]!=0;i++)
  {
    if(a[i]>='A'&&a[i]<='Z'||a[i]>='a'&&a[i]<='z')
    {
      cout<<a[i];
    }
  } 
}