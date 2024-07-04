public class Spices{

public static void name(){
System.out.println("the name of spices is MTR masala");
}

public static void type(String typee){
if(typee=="chicken masala"){
System.out.println("the spices is available:" + " "+ typee);
}else{
System.out.println("the spices is not available");
}
}

public static boolean result(String types[]){
  for(int index =0; index<types.length; index++){
  System.out.println("the types of spices are:" + " " + types[index]);
  }
  return true;
  }
  }
  