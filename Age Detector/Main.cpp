#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by;
  cin>>cy;
  if(by==00){
  	cout<<cy;
  }
  else if(by>=cy){
  	cout<<100-by+cy;
  }
  else{
  	cout<<cy-by;
  }
}
