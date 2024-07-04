public class AmazonRunner{

public static void main(String args[]){
         Amazon.search();
		 
         Amazon.name("kurtha");
		 
		 String returnvalue=Amazon.color();
		 System.out.println(" " + returnvalue);
          
		  
		 System.out.println(Amazon.price(1587));
}
}