import java.util.Scanner;

class gcd{
    public  static int  iteration_greatest_common_divisor(int a,int b) 
    { int c= Math.min(a, b);    //minimum value of the number
       for(int i=c;i>=0;i-- )//greatest common divisor cant be greater than the minimum ,so the loop executed till  minimum
      { if(a%c==0 && b%c==0)  //if the result of the moduluous of the both is 0 then we get the number and return it  
      {return c;}}
       return 1;   //other wise return 1 that is gcd   of an two 
    }
    public static int igcd(int a,int b) {
        while(a%b!=0)
        {
            int rem=a%b;
            a=b;b=rem;
        }
        return b;
    }
    //jvm start debugging from this side of the code 
    public static int recursion_gcd(int a,int b)
    {  //base case
      if (b==0)//b
      return a;
      return recursion_gcd(b, a%b);
         
    } 
    //jvm will start executing the code from here onward
     public static void main(String[] args) {
            
         Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.println("enter the numbers ");
         a=sc.nextInt();
         b=sc.nextInt();sc.close();
         int c=iteration_greatest_common_divisor(a,b);
         System.out.println("gcd is :->  ");
         System.out.println("\t\t\t\t\tyeh iteration se solve hua hai =  "+igcd(a, b));
        System.out.println("\t\t\t\t\tyeh bhi iteration se hua hai long division method ke =   "+c);
        System.out.println("\t\t\t\t\trecursion se aaya hai =   "+recursion_gcd(a, b));
    }
    
}