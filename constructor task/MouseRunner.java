public class MouseRunner{

   public static void main(String args[]){
   
   Mouse mouse=new Mouse("Dell", "MX", true, "Black",555.34);
   
   mouse.info("Lenova");
   String infomation=mouse.info1("Lenova",1000);
   System.out.println(" " + infomation);
   
   boolean infomation1=mouse.info2("Dell",1000,"Black");
   System.out.println(" " + infomation1);
   }
   }