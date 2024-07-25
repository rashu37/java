public class SnacksRunner{
     public static void main(String args[]){
	 
	 Snacks snacks=new Snacks();
	 
	 int get=snacks.getlength();
	 System.out.println(" " + get);
	 
	 String getdetails=snacks.savedetails("Panipuri");
	 String getdetails1=snacks.savedetails("Egg puff");
	 String getdetails2=snacks.savedetails("Chips");
	 String getdetails3=snacks.savedetails("Cakes");
	 String getdetails4=snacks.savedetails("Jelabi");
	 String getdetails5=snacks.savedetails("Icecream");
	 String getdetails6=snacks.savedetails("Kurkure");
	 
	 System.out.println(" " + getdetails);
	 
	 snacks.read();
	 
	 String getupdate=snacks.update("Chips", "kurkure");
	 System.out.println(" " + getupdate);
	 snacks.read();
	 
	 
	 System.out.println("Snacks found");
	 snacks.search("Egg puff");
	 
	 String getdelete=snacks.delete("Panipuri");
	 System.out.println(" "+ getdelete);
	 snacks.read();
	 }
	 }