#include <iostream>
#include<iomanip>
using namespace std;

int arrival[1000000],
  time_begin[1000000],
  time_end[1000000],
  delay[1000000],
    wait_time[1000000],
  complete_time[1000000],
  inter_arrival[1000000],
  service_time[1000000];
  
  
void inputVariable(int customer)
{
    
    for(int i=0;i<customer;i++)
    {
        cout<<"\nPlease Enter inter_arrival "<<i+1<<" : ";
        cin>>inter_arrival[i];
       cout<<"\nPlease Enter Service time of customer "<<i+1<<" : ";
        cin>>service_time[i];
    }
}

float sum_arrival_time,sum_service_time,sum_delay,sum_wait_time;

void process(int customer){
    time_begin[0]=0; 
    sum_arrival_time=0,sum_service_time=0,sum_delay=0,sum_wait_time=0;
    for(int i=0;i<customer;i++)
    {
        arrival[i]=inter_arrival[i]+arrival[i-1];
        if(i>0)
        {
        if(time_end[i-1]>arrival[i])
            time_begin[i]=time_end[i-1];
        else
            time_begin[i]=arrival[i];
        }
        time_end[i]=time_begin[i]+service_time[i];
        
         delay[i]=time_begin[i]-arrival[i];
        wait_time[i]=time_end[i]-arrival[i];
         complete_time[i]=time_end[i];
         sum_arrival_time+=inter_arrival[i];
         sum_delay+=delay[i];
         sum_wait_time+=wait_time[i];
         sum_service_time+=service_time[i];
    }
 }
 
 void outPut(int customer){
   cout<<setw(3)<<"customer"<<'\t'<<setw(8)<<"inter_arrival"<<setw(2)<<'\t'<<"arrival"<<setw(7)<<'\t'<<"service_time"<<setw(4)<<'\t'<<"time_begin"<<setw(4)<<'\t'<<"time_end"<<setw(8)<<'\t'<<"delay"<<setw(5)<<'\t'<<"wait_time"<<setw(1)<<'\t'<<"complete_time \n";
    for(int i=0; i<customer; i++)
    {
        cout<<i+1<<"\t\t"<<inter_arrival[i]<<"\t\t"<<arrival[i]<<"\t\t"<<service_time[i]<<"\t\t"<<time_begin[i]<<"\t\t"<<time_end[i]<<"\t\t"<<delay[i]<<"\t\t"<<wait_time[i]<<"\t\t"<<complete_time[i]<<endl;
    }
    cout<<"\nAverage inter_arrival time = "<<sum_arrival_time/customer<<endl;
    cout<<"Average service_time = "<<sum_service_time/customer<<endl;
    cout<<"Average delay_time = "<<sum_delay/customer<<endl;
    cout<<"Average wait_time = "<<sum_wait_time/customer<<endl;
    cout<<"speed on time of system "<<(float)complete_time[customer-1]/customer<<endl;
 }
int main()
{
  int customer;
   cout<<"Please Enter Number of Customer : ";
    cin>>customer;
    inputVariable(customer);
    process(customer);
    outPut(customer);
}
