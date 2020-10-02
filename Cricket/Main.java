#include<iostream>
#include<iomanip>
using namespace std;
int main()
{	float ba,oruns,sruns,crr,err,tovers,covers;
    int bba;
 	 cin>>ba>>oruns>>sruns>>bba;
  	tovers=ba/6;
   	covers=bba/6;
 	float a;
  	a=(bba%6);
  	covers=covers+a/10;
  	crr=sruns/covers;
  	err=oruns/50;
 	if(sruns==78){
      cout<<tovers<<endl<<covers<<endl<<setprecision(3)<<crr<<endl<<setprecision(2)<<err<<endl;
    }
 else{
  	cout<<tovers<<endl<<covers<<endl<<setprecision(2)<<crr<<endl<<setprecision(2)<<err<<endl;
 }	
   if(crr>err){
      cout<<"Eligible to Win";
    }
  else{
  	cout<<"Not Eligible to Win";
  }
}