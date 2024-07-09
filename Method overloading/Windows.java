public class Windows{

  
  public static void details(String name, int price){
  System.out.println("the window name is:" + name + " " + "price is:" + price);
  }  
  
  
  public static void details(float height, byte size){
  System.out.println("the height is:" + height+ ", " + "The size is:"+ size);
  }
  
  public static String details(double rate, int no_of_need){
    if(rate==4.0 && no_of_need==25){
       System.out.println("the ratings of window:" + " ," + "the no of windows need:" + no_of_need);
     return "It is good";
	}else{
      System.out.println("Not correct");
     return "It is bad";
	}
  }
  
  public static void details(String color, short price){
  if(color=="Brown" || price==6000){
  System.out.println("The color of window:" + color+ "," + "price is:"+ price);
  }else{
  System.out.println("Not required");
}
}  
  
  }