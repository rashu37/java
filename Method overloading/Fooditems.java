public class Fooditems{

  public static void taste(String name){
  System.out.println("the fooditem name is:" + name);
  }
  
  public static void taste(String name, int price){
  System.out.println("the fooditem name:" + name+ " " + "Price is:" + price);
  }
  
  public static void taste(String name, byte items){
  System.out.println("the Bakery name:" + name+ ", " + "how many needs:"+ items );
  }
  
  
  public static boolean taste(int price, String location){
  System.out.println("the price is:" + price + " " + "location:" + location);
  return true;
  }
  
  public static String taste(float rate, byte no_of_items){
    if(rate==4.5F && no_of_items==23){
       System.out.println("the ratings of item:" + " ," + "the no of items are:" + no_of_items);
     return "correct";
	}else{
      System.out.println("Not correct");
     return "not correct";
	}
  }
  
  public static boolean taste(double kg, int no_of_items, String name){
    if(kg==4.5 && no_of_items==500 && name=="Chocolate cake"){
       System.out.println("the cake in kg:" +kg+ " ," + "the no of items are:" + no_of_items+ "," + "the type of cake:" + name);
     return true;
	}else{
      System.out.println("Item is not available");
     return false;
	}
  }	
  
  
  }