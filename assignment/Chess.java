public class Chess{
public static void coin(){
String coin ="right";
if(coin=="right"){
 System.out.println("the coin is moved to:" + " "+ coin);
 }
 else{
 System.out.println("the coin is not  moved");
 }
 }
 
 public static void checkmate(){
 int checkmate=2;
 if(checkmate==2){
 System.out.println("the game is checkmate");
 }else{
 System.out.println("the game still to continue");
 }
 }
 
 public static void result(){
	 boolean result= true;
	 if(result){
		 System.out.println("the game is won:" + " "+ result);
	 }else{
		 System.out.println("the game is lost");
	 }
 }
 }