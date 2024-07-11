public class AmazonRunner{

   public static void main(String args[]){
   
   Amazon.search="Krutha";
   Amazon.rate=499;
   Amazon.isbad=false;
   String type="Soch";
   int bill=15000;
   boolean withgst=true;
   
   
    System.out.println("The shopping name app:" + Amazon.appname);
	System.out.println("Ratings of app:" + Amazon.ratings);
	System.out.println("Price of shopping:" + Amazon.price);
	System.out.println("Is that good:" + Amazon.isgood);
	System.out.println("Searching for:" + Amazon.search);
	System.out.println("The rate of dress:" + Amazon.rate);
	System.out.println("Is the dress good:" + Amazon.isbad);
	System.out.println("The type of brand:" + type);
	System.out.println("Total bill is:" + bill);
	System.out.println("The bill is with gst:" + withgst);
	
      
   
   }
   
   }