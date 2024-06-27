public class Passport{
public static void main(String args[]){

String name[]={"Setha"};
String to[]={"India"};
int price[]={60000};
long id[]={98765456789L};
String from[]={"England"};


for(int index=0; index<name.length; index++){
	System.out.println("Travller name :" + name[index]);
   }
for(int index=0; index<to.length; index++){
System.out.println("Coming to  : " + to[index]);
   }
for(int i=0; i<price.length; i++){
	System.out.println("Price to travel :" + price[i]);
   }
for(int i=0; i<id.length; i++){
	System.out.println("Passport id:"+ id[i]);
   }
for(int i=0; i<from.length; i++){
System.out.println("Coming from: " + from[i]);
} 

 }
 
} 