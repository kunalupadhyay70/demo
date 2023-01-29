import java.util.*;
public class square{
    Scanner sc= new Scanner(System.in);
public static int power( int i,int n) 
{
if (n==1)
return i;
return power(i,n-1)*i;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number and its power");
    int a =sc.nextInt();
    int b =sc.nextInt();
    sc.close();

    System.out.println(power(a,b));
    
}
}
