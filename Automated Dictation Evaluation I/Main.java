#include<iostream>
#include<string>
using namespace std;
int main()
{
  string word1,word2;
  getline(cin,word1);
  getline(cin,word2);
  if(word1==word2)
  {
    cout<<"It is correct";
  }
  else
    cout<<"It is wrong";
  
}