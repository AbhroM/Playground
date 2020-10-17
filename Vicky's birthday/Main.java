#include<iostream>
using namespace std;
int main(){
 	int birthYear;
  cin>>birthYear;
  if(birthYear%4==0){
  	if(birthYear%100==0){
    	if(birthYear%400==0){
        	cout<<"Vicky can celebrate his birthday.";
        }
      else{
      	cout<<"Vicky can't celebrate.";
      }
    }
      else{
      	cout<<"Vicky can celebrate his birthday.";
      }
  } 
    else{
      cout<<"Vicky can't celebrate.";
  }
 }