public class College{

     public String name;
	 public int id;
	 public short fees;
	 public String location;
	 public long num;
	 public byte coll_id;
	 public float rate;
	 public String type;
	 public boolean govrn;
	 
	public College(){
		System.out.println("Details of college");
	}

    public College(String name,int id,short fees,String location,
	long num,byte coll_id,float rate,String type,boolean govrn){
	this.name=name;
	this.id=id;
    this.fees=fees;
    this.location=location;
    this.num=num;
    this.coll_id=coll_id;
    this.rate=rate;
    this.type=type;
    this.govrn=govrn;

     System.out.println("College name:" + name +"," + "Fees:"+ fees+ ","+ "Location:" + location+ "," + "College number:" +num+
      "," + "College id:" + coll_id+ "," + "Ratings of college:" + rate+ ", " + "Type of college:" + type+ "," + "Government college:" + govrn);
   }
   
   public void details(){
	   System.out.println("Details:");
   }
   public void details1(String name, int id){
	   System.out.println("College name:" + name+ ", " + "College id:" + id);
   }
   public String getdetails(String name, int id,short fees){
	   System.out.println("College name:" + name+ ", " + "College id:" + id+", " + "College fees:" + fees);
	   return "details correct";
   }
    public boolean detailsget(String name, int id,short fees,String location,long num){
	   System.out.println("College name:" + name+ ", " + "College id:" + id+", " + "College fees:" + fees
	   +"," + "Location:"+ location+ ", " + "Number:" + num);
	   return true;
   }
   
}   