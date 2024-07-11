public class MovieRunner{

   public static void main(String args[]){
   
   Movie.language="Hindi";
   Movie.ratings=5.00F;
   Movie.isgood=true;
   int relesed=5;
   short amount=800;
   boolean hassuccesful=true;
   
   
   System.out.println("the movie name is:" + Movie.name);
   System.out.println("Total duration in hrs:" + Movie.duration);
   System.out.println("the movie ticket price:" + Movie.ticketprice);
   System.out.println("movie is in Hindi:" + Movie.ishindi);
   System.out.println("the movie available in:" + Movie.language);
   System.out.println("movie ratings:" + Movie.ratings);
   System.out.println("the movie good:" + Movie.isgood);
   System.out.println("Movie realsed in languages:"+ relesed);
    System.out.println("Total amount collected:"+ amount);
    System.out.println("Movie is succesfully run:"+ hassuccesful);
   
   
   }
   
   }