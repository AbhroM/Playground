#include<iostream>
using namespace std;
int main()
{
 int fp,fd,fs,ff,sp,sd,ss,sf,ap,ad,as,af;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  ff=fp-((fp*fd)/100)+fs;
  sf=sp-((sp*sd)/100)+ss;
  af=ap-((ap*ad)/100)+as;
  cout<<"In Flipkart Rs."<<ff<<endl;
  cout<<"In Snapdeal Rs."<<sf<<endl;
  cout<<"In Amazon Rs."<<af<<endl;
if(ff<=sf && ff<af)
    cout<<"He will prefer Flipkart";
  if(sf<ff && sf<af)
    cout<<"He will prefer Snapdeal";
  if(af<sf && af<ff)
    cout<<"He will prefer Amazon";
}