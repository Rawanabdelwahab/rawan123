#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
	double hp;
	double ny; 
	double ar;
	int day;
	int mon;
	int year;
	double m;
	cout <<"Enter Home Price : ";
	 cin >>hp;
	cout <<"Enter Number of Years : ";
	 cin>>ny;
	cout <<"Enter Annual Rate : ";
	 cin >>ar;
	cout <<"Enter First installment payment date : ";
	 cin >>day>>mon>>year;
	double p=hp*80/100;
	double nm=ny*12;
	double l=ar/12/100;
	 m = p * (l * (pow((1+l), nm)) / (pow((1 + l), nm) - 1));
	double begin=p;
	double Interest ;
    double principal;
    double ending ;  
    Interest = begin * l,
    principal = m - Interest,
//    ending = begin - principal;
	cout <<"|----------------"<<"-------"<<setw(6)<<"----------"<<setw(6)<<"-----"<<setw(6)<<"-----------"<<setw(6)<<"------------"<<setw(6)<<"--------------|"<<endl;
	cout <<"| Months |"<<setw(5)<<" Date "<<setw(5)<<"|"<<setw(14)<<"Beginng "<<setw(4) <<"|"<<" Interest    |"<<" principal|"<<"Ending balance  |"<<endl;
	cout <<"|----------------"<<"-------"<<"----------"<<"----------"<<"-----------"<<"------------"<<"----------|"<<endl; 
	for(int i=1;i<=nm;i++)
	
		{
				Interest=begin*l;
    		principal=m - Interest;
    		ending = begin - principal;
    		cout<<fixed << setprecision
			<<"|"<<setw(4)<<i<<setw(4) <<"|"<<day<<setw(2)<<"\\"<<setw(2)<<mon++<<"\\"<<setw(2)<<year<<"|"
			<<setw(2)<<begin<<setw(5)<<"|"<<setw(6)<< Interest<<setw(4)<<"|"<<setw(10)<< principal<<"|"<<setw(6)<<begin - principal <<"|"<<endl;
			if(mon==12)
			{
				year++;
				mon=1;
	
			}
		
    		begin = ending;
		}
}
