public class Fooditems{

    public static final int price=30;

  public static String items(String fooditem[], int quantity[]){
    
  for(int index= 0; index<fooditem.length; index++){

     System.out.println("the fooditem name is:" + fooditem[index]);
  }
  
    for(int i= 0; i<quantity.length; i++){
		int totalprice= Fooditems.price*quantity[i];
		System.out.println("Price is:"+ Fooditems.price + ", "+ "The quantity:" + quantity[i] + ", "+ "totalprice" + totalprice);
		}
		

	 return "Fooditems are good";
	 
	 }
	  
	  
  }
  