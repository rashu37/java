public class SocialMedia{

   public String type;
   public long id;
   public String userid;
   public byte unfollow;
   public short followers;
   public int following;
   public float rating;
   public boolean verified;
   
   public SocialMedia(){
      System.out.println("Social Media Details");
	  }
  
    
   public SocialMedia(String type, long id,String userid,byte unfollow,short followers,int following, float rating,boolean verified){
   this.type=type;
   this.id=id;
   this.userid=userid;
   this.unfollow=unfollow;
   this.followers=followers;
   this.following=following;
   this.rating=rating;
   this.verified=verified;
   System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The user id is:"+ userid+","+"The unfollowing acounts:"+ unfollow+
   "," + "followers on acounts:"+ followers+ "," + "following acounts on insta:" + following+ "," + "The ratings to acount:"+ rating
   + "," + "Account is verified:" + verified);
   }
   
   public void details(){
	   System.out.println("the Socailmedia Details");
   }
   
   public void details1(String type,long id, String userid){
	   System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The user id is:"+ userid);
   }
   
   public boolean details2(String type,long id, String userid,byte unfollow){
	   System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The user id is:"+ userid +","+ "Unfollowers:" + unfollow);
       return true;
   }
   
   public String details3(String type,long id, String userid,byte unfollow,short followers,int following){
	   System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The user id is:"+ userid +","+ "Unfollowers:" + unfollow
	   + ", " + "Followers:" + followers+ ", " + "Following:" + following);
	   return "Details";
   }
   
  
  }
  
  
  
  