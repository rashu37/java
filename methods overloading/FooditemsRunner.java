public class FooditemsRunner{

  public static void main(String args[]){
	  
	  
	String fooditem[]={"gobi", "panipuri","kachori", "eggpuff","eggroll","burger", "Maggi","Panner roll","cake", "kurkure","Samosa", "Noddles","chips","mirchi","golgapa","milkshake"};  
  
	int quantity[]= {3,4,5,2,3,5,3,2,5,6,7,8,5,7,2,4};
	String returnvalue=Fooditems.items(fooditem, quantity);
	
	
	System.out.println(" " + returnvalue);
	}
	}