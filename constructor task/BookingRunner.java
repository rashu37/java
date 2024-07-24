public class BookingRunner{

    public static void main(String args[]){
	
	Booking booking =new Booking();
	
	System.out.println("the Bus name:" + Booking.name);
	System.out.println("price:" + Booking.price);
	System.out.println("Extraprice:" + Booking.extraprice);
	System.out.println("Bus number:" + Booking.busnum);
	System.out.println("Contact number:" + Booking.number);
	
	Booking booking1 =new Booking(10.30,0.18f,"12/12/12",5.4);
	
	}
}