public class HealthReport{
public static void main(String args[]){

String name[]={"xyz"};
String type[]={"cough,fever"};
int date[]={6,7,8};
String day[]={"mon,tue,wed"};
short bill[]={300,890,1000};




for(int index=0; index<name.length; index++){
	System.out.println("Patient name is :" + name[index]);
   }
for(int index=0; index<type.length; index++){
System.out.println("patient has : " + type[index]);
   }
for(int i=0; i<date.length; i++){
	System.out.println("Date on :" + date[i]);
   }
for(int i=0; i<day.length; i++){
	System.out.println("Day :"+ day[i]);
	}
for(int i=0; i<bill.length; i++){
System.out.println("Paid bill :" + bill[i]);
}


 }
 
} 