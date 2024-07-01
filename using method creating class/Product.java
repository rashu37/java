public class Product{
public static final int warrenty=4;
public static final double offer=0.30;
public static void name(){

System.out.println("the product name is: Washing machine");

}

public static void used(){
int used=2;
int totalused= used+(Product.warrenty);
System.out.println("the washing machine total used years: " + totalused);
}

public static void price(){
int price=20000;
double totalprice= price-(Product.offer*price);
System.out.println("The total price is :"+ totalprice);

}
}