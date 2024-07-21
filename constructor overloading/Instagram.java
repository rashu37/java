public class Instagram{

  public String type;
  public long id;
  public String userid;
  public byte unfollow;
  public short followers;
  public int following;
  public float rating;
  public boolean verified;
  
  public Instagram(String type){
  this.type=type;
  System.out.println("the app is:" + type);
  }
  
  public Instagram(String type, long id){
  this.type=type;
  this.id=id;
  System.out.println("the app is:" + type+ "," + "The id is:" + id);
  }
  
  public Instagram(String type, long id,String userid){
  this.type=type;
  this.id=id;
  this.userid=userid;
  System.out.println("the app is:" + type+ "," + "The id is:" + id+ "," + "The user id is:"+ userid);
  }
  
  public Instagram(String type, long id,byte unfollow){
  this.type=type;
  this.id=id;
  this.unfollow=unfollow;
  System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The unfollowing acounts:"+ unfollow);
  }
  
  public Instagram(String type, long id,byte unfollow,short followers){
  this.type=type;
  this.id=id;
  this.unfollow=unfollow;
  System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The unfollowing acounts:"+ unfollow+
  "," + "followers on acounts:"+ followers);
  }
  
  public Instagram(String type, long id,byte unfollow,short followers,int following, float rating){
  this.type=type;
  this.id=id;
  this.unfollow=unfollow;
  this.following=following;
  this.rating=rating;
  System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The unfollowing acounts:"+ unfollow+
  "," + "followers on acounts:"+ followers+ "," + "following acounts on insta:" + following+ "," + "The ratings to acount:"+ rating);
  }
  
  public Instagram(String type, long id,byte unfollow,short followers,int following, float rating,boolean verified){
  this.type=type;
  this.id=id;
  this.unfollow=unfollow;
  this.following=following;
  this.rating=rating;
  System.out.println("the app is:" + type+ "," + "The id is:" + id+ ","+ "The unfollowing acounts:"+ unfollow+
  "," + "followers on acounts:"+ followers+ "," + "following acounts on insta:" + following+ "," + "The ratings to acount:"+ rating
  + "," + "Account is verified:" + verified);
  }
  
  }
  
  
  
  