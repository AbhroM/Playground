#include<iostream>
using namespace std;
int main()
{
  int max,anum,cnum,w;
  cin>>max>>anum>>cnum;
  w=anum*75+cnum*30;
  if(max>w){
  	cout<<"Boat is stable";
  }
  else{
  	cout<<"Boat will drow";
  }
}