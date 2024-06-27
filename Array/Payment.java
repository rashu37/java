public class Payment{
public static void main(String args[]){

String name[]={"Siri"};
String dateday[]={"10 feb"};
int transfer[]={1000};
String recived[]={"AAA"};
String type[]={"Phone pe"};

for(int index=0; index<name.length; index++){
	System.out.println("Person name is:" + name[index]);
   }
for(int index=0; index<dateday.length; index++){
System.out.println("Transcation date: " + dateday[index]);
   }
for(int i=0; i<transfer.length; i++){
	System.out.println("trransfed on :" + transfer[i]);
   }
for(int i=0; i<recived.length; i++){
	System.out.println("Recevied:"+ recived[i]);
   }
for(int i=0; i<type.length; i++){
System.out.println("transefer type:" + type[i]);
   }

 }
 
} 