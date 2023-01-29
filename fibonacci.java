import java.util.*;
public class fibonacci {
    public static void sum(int a,int b,int n) {
        if (n==0)
        return ;
        int c= a+b;
        System.out.println(c);
        sum(b,c,n-1);
    }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the lenght of the fiboonacii series ");
    int a=sc.nextInt();
    sc.close();
    System.out.print("your fibonacci series is :-"+"\n");
    System.out.print(0+"\n");
    System.out.print(1+"\n");
    sum(0,1,a-2);
    
}
}
