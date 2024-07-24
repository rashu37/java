public class AlphabetsRunner{
   
   public static void main(String args[]){
   
   Alphabets alphabets=new Alphabets();
   
   int result=alphabets.getlength();
   System.out.println(" " + result);
   
   String get=alphabets.getalpha('A');
   String get1=alphabets.getalpha('S');
   String get2=alphabets.getalpha('B');
   String get3=alphabets.getalpha('E');
   String get4=alphabets.getalpha('R');
   String get5=alphabets.getalpha('U');
   System.out.println(" " + get);
   alphabets.read();
   
   }
   }
   