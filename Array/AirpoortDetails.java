public class AirportDetails{
public static void main(String args[]){

String name[]={"xyz"};
String dateday[]={"10 feb"};
double time[]={1.30};
String destination[]={"londan"};
String from[]={"India"};

for(int index=0; index<name.length; index++){
	System.out.println("Person name is:" + name[index]);
   }
for(int index=0; index<dateday.length; index++){
System.out.println("Plane date: " + dateday[index]);
   }
for(int i=0; i<time.length; i++){
	System.out.println("time :" + time[i]);
   }
for(int i=0; i<destination.length; i++){
	System.out.println("Destination to :"+ destination[i]);
   }
for(int i=0; i<from.length; i++){
System.out.println("Plane from:" + from[i]);
   }

 }
 
} 