public class SocialMediaRunner{
   public static void main(String args[]){
   
   SocialMedia socialmedia=new SocialMedia();
   
   SocialMedia socialmedia1=new SocialMedia("Instagram",98735435342L,"Seetha@123",(byte)50,(short)29900,(int)45000,4.5F,true);
   
   socialmedia.details();
   socialmedia.details1("Facebook",98376540l,"Ram123");
   
   boolean profile=socialmedia.details2("Facebook",98376540l,"Ram123",(byte)55);
   System.out.println(" " + profile);
   
   String profile1=socialmedia.details3("Facebook",98376540l,"Ram123",(byte)55,(short)24000,(int)2054);
   System.out.println(" " + profile1);
   
   }
	}