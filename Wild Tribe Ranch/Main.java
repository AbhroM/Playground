#include<iostream>
using namespace std;
int main()
{
 	int  max,a;
  	cin>>max>>a;
  if(max>a){
  	cout<<"Yes, you can enter.";
  }
  else if(max==a){
  	cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else{
  	cout<<"Sorry, you can't enter";
  }
}