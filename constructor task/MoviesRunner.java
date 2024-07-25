public class MoviesRunner{

   public static void main(String args[]){
   
   Movies movies=new Movies();
   
   int get=movies.getlength();
   System.out.println(" " + get);
   
   String getsaved=movies.savedetails("SitaRama");
   String getsaved1=movies.savedetails("Life god");
   String getsaved2=movies.savedetails("Endukuante perma");
   String getsaved3=movies.savedetails("Arya");
   String getsaved4=movies.savedetails("Parmathma");
   //String getsaved5=movies.savedetails("college days");
   System.out.println(" " + getsaved);
   
   movies.read();
   
   String getupdate=movies.update("Life god","Jolly days");
   System.out.println(" " + getupdate);
   movies.read();
   
   movies.delete("SitaRama");
   movies.read();
   }
   }