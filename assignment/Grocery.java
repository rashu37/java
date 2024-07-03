public class Grocery{

public static int name(String type){
if(type=="rice"){
System.out.println("the required is:" + " " + type);
return 1200;
}else{
System.out.println("the item is not required");
return 0000;
}
}

public static String detail(int price){
if(price>1000){
System.out.println("the total price is:" + " " + price);
return "Vegetables";
}else{
System.out.println("the total price is more:"+ " " + price);
return "none";
}
}

public static int type2(String type){
if(type=="wheat"){
System.out.println("the required is:" + " " + type);
return 1200;
}else{
System.out.println("the item is not required");
return 1000;
}
}
}
