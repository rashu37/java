public class Shopping{
public static final double discount=0.20;
public static void cloth(){

System.out.println("The type of cloth is: Cotton");
System.out.println("The brand is: Soch");
}

public static void price(){
int price =5000;
double totalprice= price-(price*Shopping.discount);
System.out.println("the total amount paid is:"+ totalprice);

}
}    