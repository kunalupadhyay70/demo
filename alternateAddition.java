// adding the alternate sign with integer n 

public class alternate {
   static int seriesSum(int n){
        if(n==0)
         return 0 ;
         if( n%2==0)
         return seriesSum(n-1) -n;//having negative sign at the even integer 
         else 
              
         return seriesSum(n-1)+n;
        
         }
    public static void main(String[] args) {
        System.out.println(seriesSum(4));
        
    }
    
}
