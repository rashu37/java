public class ClothspriceRunner{

      public static void main(String args[]){
	  
	  ClothsPrice clothprice=new ClothsPrice(); //default constructor
	  
	  
	  int result=clothprice.getlength();
	  System.out.println(" " + result);
	  
	  String get=clothprice.getprices(300);
	  String get1=clothprice.getprices(200);
	  String get2=clothprice.getprices(250);
	  String get3=clothprice.getprices(500);
	  String get4=clothprice.getprices(450);
	  String get5=clothprice.getprices(150);
	  System.out.println(" " + get);
	  
	  
	  clothprice.read();
	  
	  String getupdate=clothprice.update(300,650);
	  System.out.println(" " + getupdate);
	  clothprice.read();
	  
	  clothprice.search(650);
	  }
	  }
	 