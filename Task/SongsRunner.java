public class SongsRunner{

public static void main(String args[]){

    Songs.song();
	
    Songs.subscribe(50);
	String lang[]={"kannada", "hindi", "English", "telagu"};
	
	String returnvalue=Songs.language(lang);
    System.out.println(" " + returnvalue);

}
}