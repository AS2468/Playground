#include <iostream>
#include<string>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  student s;
  string a;
  getline(cin,a);
  s.name=a;
  cout<<"\n"<<"Student Details\n"<<"Name: "<<s.name;
  int roll,marks;
  cin>>roll>>marks;
  s.roll=roll;
  s.marks=marks;
  cout<<"\n"<<"Roll: "<<s.roll<<"\n"<<"Marks: "<<s.marks;
}