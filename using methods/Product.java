public class Product{
   public static int name(String type){
if(type=="cream"){
System.out.println("the item required is:" + " " + type);
return 1200;
}else{
System.out.println("the item is not required");
return 0000;
}
}

public static String brand(String type){
if(type=="lipstick"){
System.out.println("the required is:" + " " + type);
return "lakme";
}else{
System.out.println("the item is not required");
return "none";
}
}

public static void price(int rate){
	//int rate=1500;
	System.out.println("the price of the product is:" + rate);
	
}
}