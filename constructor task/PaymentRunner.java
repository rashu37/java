public class PaymentRunner{

     public static void main(String args[]){
	 
	 Payment payment=new Payment();
	 
	 int getlengthdetails=payment.getlength();
	 System.out.println(" " + getlengthdetails);
	 
	 
	 String getsavedetails=payment.savedetails(20000);
	 String getsavedetails1=payment.savedetails(30000);
	 String getsavedetails2=payment.savedetails(25000);
	 String getsavedetails3=payment.savedetails(35000);
	 String getsavedetails4=payment.savedetails(26000);
	  String getsavedetails5=payment.savedetails(28000);
	   String getsavedetails6=payment.savedetails(29000);
	 System.out.println(" " + getsavedetails);
	 
	 payment.read();
	 
	 System.out.println("Updated Payment");
	 String getupdate=payment.update(30000,50000);
	 System.out.println(" " + getupdate);
	  payment.read();
	  
	  System.out.println("Deleted");
	  String getdelete=payment.delete(35000);
	  System.out.println(" " + getdelete);
	  
	  System.out.println("Searching");
	  payment.search(20000);
	  payment.read();
	  
	 }
	 }