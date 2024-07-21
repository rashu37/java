public class Bank{
     public String name;
	 public int id;
	 public long num;
	 public String mang_name;
	 public long mang_num;

      public Bank(String name){
		 this(675);
	 this.name=name;
      System.out.println("the bank name is:" + name);
	  }
	  
	  public Bank(int id){
		  this(834654636L);
	  this.id=id;
		  System.out.println("the bank id:" + id);
	  }
	  
	  public Bank(long num){
		  this("Mr.jaya",957756577L);
	     this.num=num;
	    System.out.println("the bank number is:" +  num);
	  }
	  
	  public Bank(String mang_name, long mang_num){
	       this.mang_name=mang_name;
		   this.mang_num=mang_num;
		  System.out.println("the bank manager name:" + " " + mang_name+ " ," + "manager number:" + mang_num);
	  }




}
