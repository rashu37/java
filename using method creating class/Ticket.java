public class Ticket{
public static final int price=4000;
public static final double gst=0.18;
public static void price(){

System.out.println("the ticket price is:" + Ticket.price);

}

public static void getgst(int amount){
double totalprice= amount+(amount*Ticket.gst);
System.out.println("the total price including gst: " + totalprice);


}
}