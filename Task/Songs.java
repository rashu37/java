public class Songs{

public static void song(){
System.out.println("Searching for songs");
}

public static void subscribe(int rate){
	if(rate<100){
		System.out.println("The subscription is available");
	}else{
		System.out.println("The subscription is not available");
	}
}

public static String language(String lang[]){
	for(int index= 0; index< lang.length; index++){
		System.out.println("the songs available in language:" + " " + lang[index]);
	}
	return "any language songs available";
}

}
