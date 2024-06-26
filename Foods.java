public class Foods{
public static void main(String args[]){

int types[]={20};
String menu[]={"roti", "Dal", "Rice"};
int price[]={2000};
String location[]={"Koppal"};
long phone[]={987653145074L};

for(int i=0; i<types.length; i++){
	System.out.println("Food types are:" + types[i]);
   }
for(int i=0; i<menu.length; i++){
System.out.println("Food menu are:" + menu[i]);
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