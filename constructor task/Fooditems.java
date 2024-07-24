public class Fooditems{

  public static void taste(String name){
  System.out.println("the fooditem name is:" + name);
  Fooditems.taste("cakes", 766);
  }
  
  public static void taste(String name, int price){
  System.out.println("the fooditem name:" + name+ " " + "Price is:" + price);
  Fooditems.taste("Krishna", 450);
  }
  
  public static void taste(String name, byte items){
  System.out.println("the Bakery name:" + name+ ", " + "how many needs:"+ items );
  Fooditems.taste(550, "Koppal");
  }
  
  public static void taste(int price, String location){
  System.out.println("the price is:" + price + " " + "location:" + location);
  }
  
  
  
  }