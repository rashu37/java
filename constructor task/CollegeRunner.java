public class CollegeRunner{
   public static void main(String args[]){
   
   
   College college1=new College();
   College college=new College("PDIT", (int)5463, (short)25000,"Hospet",8765437648l,(byte)54,5.4f,"Degree college", false);
   
   college.details();
   college.details1("SVIT",(int)3343);
   
   String details2=college.getdetails("SVIT",(int)3343,(short)25000);
   System.out.println(" " + details2);
   
   boolean details3=college.detailsget("SVIT",(int)3343,(short)25000,"Koppal",876543487l);
   System.out.println(" " + details3);
   
   
   }
}