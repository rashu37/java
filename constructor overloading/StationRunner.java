public class StationRunner{

  public static void main(String args[]){
  
  Station station=new Station("Kempegowda station");
 
  Station station1=new Station("Kempegowda station",(byte)90);
  Station station2=new Station("Kempegowda station",(byte)90,(int)5000);
  Station station3=new Station("Kempegowda station",(byte)90,(int)5000,"bengaluru");
  Station station4=new Station("Kempegowda station",(byte)90,(int)5000,"bengaluru",78.9);
  Station station5=new Station("Kempegowda station",(byte)90,(int)5000,"bengaluru",78.9,33.87F);
    Station station6=new Station("Kempegowda station",(byte)90,(int)5000,"bengaluru",78.9,33.87F,false);

  }
  }