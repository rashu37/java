public class MultiplyofThree{
  public static void main(String args[]){
  
  int num[]= { 3,6,9,2,7,67,12,15,18};
  for( int index =0; index< num.length; index++){
  
  if(num[index] % 3==0){
  System.out.println(" the number is multiply of 3:" + num[index]);
  }else{
	  
	  System.out.println(" the number is not multiply of 3:"+ num[index]);
}
}
}
}