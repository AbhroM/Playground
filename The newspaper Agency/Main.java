#include<iostream>
using namespace std;
int main()
{
  int w,x,y,fcost;
  int fix=100;
  cin>>w;
  cin>>x;
  cin>>y;
  fcost=(((w*x)-(w*y))-fix);
  cout<<fcost;
}