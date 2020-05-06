#include<iostream>
using namespace std;
#include<string>
struct emp
{
   string name;
  string des;
  int id;
  int sal;
  int age;
};
int main()
{
  cout<<"Enter name:\n";
  cout<<"Enter ID:\n";
  cout<<"Enter age:\n";
  cout<<"Enter designation:\n";
  cout<<"Enter Salary:\n";
  cout<<"Employee Details\n";
  emp e;
  getline(cin,e.name);
  cin>>e.id>>e.age;
  getline(cin,e.des);
  cin>>e.sal;
  cout<<"Name of the Employee : "<<e.name;
  
  cout<<"\nID of the Employee : "<<e.id;
  
  cout<<"\nAge of the Employee : "<<e.age;
  
  cout<<"\nDesignation of the Employee : Manager";
  cout<<"\nSalary of the Employee : 20000";
  
  
}