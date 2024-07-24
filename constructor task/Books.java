public class Books{

   String title;
   String author;
   int price;
   byte realsed;
   double ratings;
   
    public Books(){
		System.out.println("Book details");
	}
   
   public void details(String title, String author){
	  //("The tree","Mr kiran",1799);
	 System.out.println("the book title:"+ title+ ","+ "Author:" +author);
	 ("The tree","Mr kiran",(int)1799);
	 }
	 
	 
   public void details1(String title, String author, int price){
	//("Life trees","kiran",1300, 23,5.5);
     System.out.println("the book title:"+ title+ "," +"Author:" + author + ", " + "Price:" + price);
	 ("Life trees","kiran",(int)1300,(byte)23,5.5);
	 }
	 
   public void details2(String title, String author, int price,byte realsed,double ratings){
	 System.out.println("the book title:"+ title+ "," +"Author:" + author + ", " + "Price:" + price
	 + ", " + "Realsed on"+ realsed + ", " + "Ratings:" + ratings);
	 }
	 }