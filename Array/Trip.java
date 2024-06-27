public class Trip{
public static void main(String args[]){

String name[]={"xyz", "Setha","Siri"};
String dateday[]={"10 feb"};
double time[]={1.30};
String destination[]={"Mysore", "Bengaluru","Malnad"};
String from[]={" "};


for(int index=0; index<name.length; index++){
	System.out.println("Person names are:" + name[index]);
   }
for(int index=0; index<dateday.length; index++){
System.out.println("Trip dateday: " + dateday[index]);
   }
for(int i=0; i<time.length; i++){
	System.out.println(" Tirp timing :" + time[i]);
   }
for(int i=0; i<destination.length; i++){
	System.out.println("Destination to :"+ destination[i]);
   }
for(int i=0; i<from.length; i++){
System.out.println("Persons from:" + from[i]);
   }

 }
 
} 