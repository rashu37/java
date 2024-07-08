public class Payment{

   public static void info(String name){
   System.out.println("The paid by person is"+ name);
   }

    public static void info(int price, String mode){
	System.out.println("The payment amount and payment mode:"+ price+ " " + mode);
    }

    public static void info(short payment, String name){
 	System.out.println("The total amount paid to person:" + payment+ name);
	}
	
	public static void info(float gst){
    System.out.println("the gst also paid:" + gst);	
}
} 