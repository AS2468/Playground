#include<iostream>
#include<string>
using namespace std;
int main()
{
  char ch[20]; int c=0;
  cin.getline(ch,20);
  for(int i=0;ch[i]!='\0';i++)
  {
    c++;
  }
  cout<<"The number of letters in the name is "<<c;
}