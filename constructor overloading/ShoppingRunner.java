public class ShoppingRunner{

  public static void main(String args[]){
  
  Shopping shopping= new Shopping("Krutha");
  Shopping shopping1= new Shopping("Krutha",4000);
  Shopping shopping2= new Shopping("Krutha",4000,(byte)120);
  Shopping shopping3= new Shopping("Krutha",4000,(byte)120,(short)20000);
   Shopping shopping4= new Shopping("Krutha",4000,(byte)120,(short)20000,"Soch",'S');
      Shopping shopping5= new Shopping("Krutha",4000,(byte)120,(short)20000,"Soch",'S',0.18);
	  
  }
}