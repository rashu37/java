public class CarRunner{
   public static void main(String args[]){
   

	
	RealEstate.property("Rolls royce");
	System.out.println(RealEstate.price(150000));
	
	String location[]={"India", "Dubai", "London"};
	double returnvalue= RealEstate.size(location);
	System.out.println(" " + returnvalue);
	
	}
	}