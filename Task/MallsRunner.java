public class MallsRunner{

public static void main(String args[]){
         Malls.search();
		 
         Malls.name("zara");
		 
		 String returnvalue=Malls.types();
		 System.out.println(" " + returnvalue);
          
		  
		 System.out.println(Malls.price(8000));
}
}