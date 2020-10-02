#include<iostream>
using namespace std;
int main()
{
  float mil;
  int fuel,dist;
  cin>>mil;
  cin>>fuel;
  cin>>dist;
  if(mil*fuel>=dist){
  	cout<<"Can reach";
  }
  else{
  	cout<<"Cannot reach";
  }
}