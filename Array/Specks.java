public class Specks{
public static void main(String args[]){

String type[]={"Normal Lens"};
String company[]={"Lens Cart"};
int price[]={2000};
String location[]={"Koppal"};
long phone[]={987653145074L};

for(int index=0; index<type.length; index++){
	System.out.println("Specs type is:" + type[index]);
   }
for(int index=0; index<company.length; index++){
System.out.println("company is" + company[index]);
   }
for(int i=0; i<price.length; i++){
	System.out.println("Price:" + price[i]);
   }
for(int i=0; i<location.length; i++){
	System.out.println("located in:"+ location[i]);
   }
for(int i=0; i<phone.length; i++){
System.out.println("Phone Number:" + phone[i]);
   }

 }
 
} 