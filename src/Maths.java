
public class Maths {
    static double add(double x,double y){
    	return(x+y); 
     }
    static double sub(double x,double y){
    	 return(x-y);
     }
    static double div(double x,double y){
     	return(x/y); 
      }
      static double mul(double x,double y){
     	 return(x*y);
      }
      static double pow(double x,double y){
    	  double ans=x;
    	  for(int a=2;a<=y;a++){
    		ans*=x;  
    	  }
      return ans;}
      
}
