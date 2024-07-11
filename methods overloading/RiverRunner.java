public class RiverRunner{

   public static void main(String args[]){
   
   River.name="Ganga";
   River.length=4563;
   River.polluted=false;
   
   String type="Freshwater";
   int width=150;
   boolean hassource=true;
   
   
   System.out.println("the longest river name:"+ River.longestriver);
   System.out.println("the average length of river:"+River.avglength);
   System.out.println("the number of rivers:"+River.numberofrivers);
   System.out.println("Fishing is allowed in the river:"+River.fishing);
   System.out.println("Another river name:"+ River.name);
   System.out.println("River length:"+ River.length);
   System.out.println("Is river polluted:"+ River.polluted);
   System.out.println("the type of water:"+ type);
   System.out.println("River width:"+ width);
   System.out.println("River has source:"+ hassource);
      
   
   }
   
   }