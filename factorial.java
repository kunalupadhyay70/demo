public class factorial{
public static int power( int i) 
{
if (i==1)
return i;
return power(i-1)*i;
}
public static void main(String[] args) {
    System.out.println(power(5));
    
}
}
