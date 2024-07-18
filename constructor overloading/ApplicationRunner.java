public class ApplicationRunner{

   public static void main(String args[]){
   
   Application application1=new Application();
  //System.out.println(" " + application1);
   Application application=new Application("Seetha");
   System.out.println("Information"+ application);
   byte b=22;
   Application application2=new Application("Seetha",b,35000);
    Application application3=new Application("Seetha",b,35000, "21/feb/2002");
	Application application4=new Application("Seetha",b,35000, "21/feb/2002",8764567387L);
	Application application5=new Application("Seetha",b,35000, "21/feb/2002",5);
	//Application application6=new Application("Seetha",b,35000, "21/feb/2002",true);

   }
   }