public class Books{

   String title;
   String author;
   int price;
   byte realsed;
   double ratings;
   
   public void details(String title, String author){
	 System.out.println("the book title:"+ title+ ","+ "Author:" +author);
	 }
	 
	 
   public void details1(String title, String author, int price){
     System.out.println("the book title:"+ title+ "," +"Author:" + author + ", " + "Price:" + price);
	 }
	 
   public void details2(String title, String author, int price,byte realsed,double ratings){
	 System.out.println("the book title:"+ title+ "," +"Author:" + author + ", " + "Price:" + price
	 + ", " + "Realsed on"+ realsed + ", " + "Ratings:" + ratings);
	 }
	 }