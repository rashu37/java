public class Kitchen{

public static void available(){
System.out.println("In kitchen gas and cylinder is available");
}

public static void appliance(String type){
	if(type=="microwave"){
		System.out.println("The appliance is available in kitchen.");
	}else{
		System.out.println("The appliance is not available");
	}
}

public static String ingridents(String lang[]){
	for(int index= 0; index< lang.length; index++){
		System.out.println("the ingridents available in kitchen:" + " " + lang[index]);
	}
	return "Kitchen is clean";
}

}
