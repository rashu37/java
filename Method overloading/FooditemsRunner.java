public class FooditemsRunner{

  public static void main(String args[]){
  
  Fooditems.taste("Kachori");
  Fooditems.taste("Egg puffs", 564);
  Fooditems.taste("Iynegar", 500);
  
  System.out.println(Fooditems.taste(550, "Bengaluru"));
  byte b=65;
  String returnvalue=Fooditems.taste(4.5F, b);
  System.out.println(" " + returnvalue);
  double d= 4.5;
  boolean value=Fooditems.taste(d, 500, "Chocolate cake");
  System.out.println(" " + value);
  
  }
  }
  
  