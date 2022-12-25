#include <iostream>
#include <cstdlib>
#include <cmath>
#include <ctime>

  using namespace std;
  
     int main(){
       srand(time(0));
      int customer,m,s;
        cout <<"enter number of customer : ";
		 cin >>customer;
       	cout <<"Enter Mean in Minutes\n ";
	 	 cin >>m;
		cout <<"Enter standard devition in Minutes\n ";  
		 cin >>s;
   
  cout<<"enter number of time between inter_arrival : ";
   int num;
cin>>num;

  float time_inter_arrival[num],probability[num];  
    
      int arrival[customer]={0};
       int service_time[customer];
       
       for(int i=0;i<num;i++){
  cout<<"\nenter time between inter_arrival at hour : ";
cin >>time_inter_arrival[i];
cout<<"probability is : ";
cin >>probability[i];
}
float temp=0;
 for(int i=0;i<num;i++)
 {temp+=probability[i];
 probability[i]=temp;
 time_inter_arrival[i]*=60;
 }

 	cout <<"----------------------------------------------------------------------------------------------------------------\n";
	cout<<"| customer"<<"|    Rand   "<<"  | inter_arrival"<<"| arrival"<<"| service_time"<<"| time_begin"<<"| time_end"<<"| wait_time "<<"| complete_time|\n";
	cout <<"----------------------------------------------------------------------------------------------------------------\n";
       int wait_queue=0;
       int service_start_time,prev_service_end_time=0,serv[2]={25,50};
      for(int i=0;i<2;i++){
        char c=i+65;
      cout<<"|"<<c<<"\t  |"<<"    given    |"<<" unknown      |"<<" 0      | ";
     //service_time  
      cout<<serv[i]<<"\t      | ";
    //begin
       if(prev_service_end_time<=0)
        service_start_time= 0;
         else 
        service_start_time= prev_service_end_time ;
    cout<< service_start_time<<"\t  | ";
    //end
    cout<<service_start_time+serv[i]<<"\t    | ";  
    //waiting queue
         
         if(prev_service_end_time>0)
         wait_queue=prev_service_end_time;
         else wait_queue=0;
        cout<<wait_queue<<" \t| ";
         //time system
      cout<<wait_queue+serv[i]<<"\t       |";
      //idle
//      cout<<"0 "<<"\t\t";
                  prev_service_end_time=service_start_time+serv[i];
                  cout<<endl;
	cout <<"----------------------------------------------------------------------------------------------------------------\n";	
      }

       float random;
       
    int sum_arrival_time=0,idel=0,j=0;
   int   average_service_time=0,average_waiting_queue=0,max_timesystem=0 ;
int i;
       for( i=0;i<customer;i++){
             
          cout<<"|"<<i+1<<"\t  |";
 
//      random= (float)rand()%(1-0+1)+0;
		 random= (float) rand() / RAND_MAX;
      j=0;

         cout<<random<<"\t|";
while(random>probability[j])
j++;
       cout <<time_inter_arrival[j]<<" \t       | ";
        //arrival time
     sum_arrival_time+=time_inter_arrival[j];

         cout<<sum_arrival_time<<"\t "; 

           service_time[i]=rand()%((m+s)-(m-s)+1)+(m-s);
         
        cout<<service_time[i]<<"\t      | "; 
      average_service_time+=service_time[i];
         //begin
         if(prev_service_end_time<=sum_arrival_time)
        service_start_time= sum_arrival_time;
         else 
        service_start_time= prev_service_end_time ;
     
    cout<< service_start_time<<"\t  | ";
         
        cout<<service_start_time-time_inter_arrival[j]<<"\t    | ";
         
         if(prev_service_end_time>sum_arrival_time)
         wait_queue=prev_service_end_time-sum_arrival_time;
         else wait_queue=0;
     
      cout<<wait_queue<<" \t | ";
       average_waiting_queue+=wait_queue;
        //time system

      cout<<wait_queue+service_time[i]<<"\t       |";
        if(max_timesystem<wait_queue+service_time[i])
        max_timesystem=wait_queue+service_time[i];
         //idle time
         idel=sum_arrival_time-prev_service_end_time;
//       if(idel<0)
       
//        cout<<"0"<<"\t\t";
//        else
        
		                  cout<<endl;
	cout <<"----------------------------------------------------------------------------------------------------------------\n";              
         }
         cout<<endl<<endl;

cout<<"average service_time is :  " ;cout<<average_service_time/customer;
cout<<"\naverage  waiting_queue is :  "<<average_waiting_queue/customer;
cout<<"\nmaximum time in system for the new :  "<<i<<"\t        "<<max_timesystem ;
   }
