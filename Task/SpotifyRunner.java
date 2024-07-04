public class SpotifyRunner{

public static void main(String args[]){

    Spotify.song();
	
    Spotify.permium(50);
	String lang[]={"kannada", "hindi", "English", "telagu"};
	
	String returnvalue=Spotify.language(lang);
    System.out.println(" " + returnvalue);

}
}