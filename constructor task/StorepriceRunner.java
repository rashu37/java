public class StorepriceRunner{

      public static void main(String args[]){
	  
	  StorePrice storeprice=new StorePrice(); //default constructor
	  
	  
	  int result=storeprice.getlength();
	  System.out.println(" " + result);
	  
	  String get=storeprice.getprices(300);
	  String get1=storeprice.getprices(200);
	  String get2=storeprice.getprices(250);
	  String get3=storeprice.getprices(500);
	  String get4=storeprice.getprices(450);
	  String get5=storeprice.getprices(150);
	  System.out.println(" " + get);
	  
	  storeprice.read();
	  
	  
	  }
	  }
	 