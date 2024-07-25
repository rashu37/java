public class CountryRunner{

   public static void main(String args[]){
   
   Country country= new Country();
   
   int get=country.getlength();
   System.out.println(" " + get);
   
   String getdetails=country.savedetails("Karnataka");
   String getdetails1=country.savedetails("Chennia");
   String getdetails2=country.savedetails("Hydrabad");
   String getdetails3=country.savedetails("Goa");
   String getdetails4=country.savedetails("Rajsthan");
   System.out.println(" " + getdetails);
   
   country.readdetails();
   
   System.out.println("Updated succsfully");
   String updatedetails=country.update("Chennia","Mahatrastra");
   System.out.println(" " + updatedetails);
   country.readdetails();
   
   String resultdelete=country.delete("Hydrabad");
   System.out.println(" "+ resultdelete);
   country.readdetails();
   
   
   country.search("Goa");
   country.readdetails();
   }
   }