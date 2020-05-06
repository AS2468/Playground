#include<iostream>
#include<cstdlib>
using namespace  std;

int main(){
  int n,i,male,fm=0;
  cin>>n;
 	int *p=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  cin>>*(p+i);
  for(i=0;i<n;i++)
  {
    if(*(p+i)%2!=0)
      male+=1;
    else
      fm+=1;
  }
  free(p);p=NULL;
  cout<<male<<"\n";
  cout<<fm;
  return 0;
}