public class MyntraRunner{

public static void main(String args[]){
         Myntra.search();
		 
         Myntra.name("kurtha");
		 
		 String returnvalue=Myntra.color();
		 System.out.println(" " + returnvalue);
          
		  
		 System.out.println(Myntra.price(1600));
}
}