public class Booking{

    static String name="VRL";
    static int price=1900;
    static byte extraprice=120;
    static String busnum="ka1234";
	static long number=987656372l;
	
    double timing;
    float gst;
	String date;
	double ratings;
	
	
	public Booking(){
         System.out.println("the Booking details");
		 }
   

    public Booking(double timing,float gst,String date,double ratings){
	   this.timing=timing;
	   this.gst=gst;
	   this.date=date;
       this.ratings=ratings;
	   System.out.println("Bus timing:" + timing+ ", " + "Including gst:" + gst+ ", " + "On date:" + date+ ", " + "Bus ratings:" + ratings);
	   
	   }

} 