public class EvenOdd{
   public static void main(String args[]){
   
   int elements[]={2,6,7,23,1,8,10,21};
   
   int even=0;
   int odd=0;
   for(int i =0; i< elements.length; i++){
    if(elements[i] % 2==0){
	  System.out.println("the even number is:" + elements[i]);
      }else
      {
       System.out.println("the odd number is:" + elements[i]);
}
       //System.out.println("the total even number:"+ even.length);
	  // System.out.println("the total odd number:" + odd.length);
}
}	   

} 