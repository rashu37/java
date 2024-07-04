public class KitchenRunner{

public static void main(String args[]){

    Kitchen.available();
	Kitchen.appliance("microwave");
	
	String lang[]={"sugar","rice", "snacks","Tea"};
	System.out.println(Kitchen.ingridents(lang));
	
	}
	}