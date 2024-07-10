public class AirportDetailsRunner{

    public static void main(String args[]){
	
	AirportDetails.name="KempeGowda airport";
	AirportDetails.location="Bengaluru";
	AirportDetails.km=5.6F;
	AirportDetails.opens=6;
	AirportDetails.closes=10.30;
	
	System.out.println("Airport Details");
	System.out.println("Airport name:" + AirportDetails.name);
	System.out.println("Location:" + AirportDetails.location);
	System.out.println("length in km :" + AirportDetails.km);
	System.out.println("Airport opens at:" + AirportDetails.opens);
	System.out.println("Airport closes at:" + AirportDetails.closes);
	
	
	}
	}