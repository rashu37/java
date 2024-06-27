public class Bikes{
public static void main(String args[]){

String name[]={"xyz", "Rx 100","KTM"};
String millage[]={" 190 km per hour"};
int price[]={80000,62267,1019870};

for(int index=0; index<name.length; index++){
	System.out.println("Bikes names are:" + name[index]);
   }
for(int index=0; index<millage.length; index++){
System.out.println("Bikes can ride for: " + millage[index]);
   }
for(int i=0; i<price.length; i++){
	System.out.println(" Bikes prices are :" + price[i]);
   }

 }
 
} 