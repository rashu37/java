public class News{

  public String name;
  public int date;
  public String day;
  public String publisher;
  public double rating;
  public boolean govrn;
  
  
  public News(String name,int date,String day){
  this.name=name;
  this.date=date;
  this.day=day;
  System.out.println("News name:" + name+ "," + "publised on:"+date+ "," + "on day:"+day);
   }
   
     public News(String publisher,double rating,boolean govrn){
	 this.publisher=publisher;
	 this.rating=rating;
	 this.govrn=govrn;
	 System.out.println("Artical is publised by:" + publisher+ "," + "Ratings for article:" + rating+ "," + "is article topic about governament:"+govrn);
	 }
	 
	 }
   