public class RealEstateRunner{
    
	public static void main(String args[]){
	
	RealEstate.property("apartment");
	System.out.println(RealEstate.price(111111));
	
	String location[]={"koppal", "Hospet", "begaluru"};
	double returnvalue= RealEstate.size(location);
	System.out.println(" " + returnvalue);
	}
	}