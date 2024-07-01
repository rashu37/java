public class Order{
public static final int delivary=40;
public static final double offer=0.10;
public static void name(){

System.out.println("the Zomato order is food");

}

public static void amount(){
int amount=200;
int totalamount= amount+(Order.delivary);
System.out.println("the total amount including delivary: " + totalamount);
}

public static void paid(){
int paid=240;
double totalprice= paid-(Order.offer);
System.out.println("The total price is :"+ totalprice);

}
}