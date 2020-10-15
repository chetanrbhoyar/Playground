
#include<iostream>
using namespace std;
void swap(int &,int &);
int main()
{
	int a,b;
	cin>>a>>b;
	cout<<"Before swapping a= "<<a<<" and "<<"b="<<b;
	swap(a,b);
//	cout<<"\nOutside function a0fter swapping\nValue of A is"<<a<<"\nValue of B is"<<b; 
}
void swap(int &a,int &b)
{
	int c;
	c=a;
	a=b;
	b=c;
	cout<<"\nAfter swapping a= "<<a<<" and "<<"b="<<b;
}
