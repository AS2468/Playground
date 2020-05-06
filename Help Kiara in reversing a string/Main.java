#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end,a, i;    
 cin.getline(str,100);
 for(i=0;str[i]!='\0';i++)
  a=i;
for(i=a;i>=0;i--)
	cout<<str[i];
}