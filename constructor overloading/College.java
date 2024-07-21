public class College{

     public String name;
	 public int id;
	 public short fees;
	 public byte coll_id;
	 public float rate;
	 public boolean govrn;

    public College(String name){
		this((int)87575);
	this.name=name;
	System.out.println("College name:" + name);
	 }
	 
	 public College(int id){
		 this((short)25000);
	 this.id=id;
	 System.out.println("College id:" + id);
	 }
	 
	 public College(short fees){
		 this((byte)23);
	 this.fees=fees;
	 System.out.println("Total fees:" + fees);
	 }
	 
	 public College(byte coll_id){
		 this(5.5F);
	 this.coll_id=coll_id;
	 System.out.println("College id is:" + coll_id);
	 }
	 
	 public College(float rate){
		 this(true);
	 this.rate=rate;
	 System.out.println("College ratings:" + rate);
	 }
	 
	 public College(boolean govrn){
	 this.govrn=govrn;
	 System.out.println("Is college government:"+ govrn);
	 }
 
}
