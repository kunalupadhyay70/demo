import java.util.Scanner;
public class palindrome {
    public static boolean ispalindrome(String s,int l,int r)
   { if (l>=r)
    return true;

    return s.charAt(l)==s.charAt(r) && ispalindrome(s,l+1,r-1);
   }
   public static void main(String[] args) {
    System.out.println("enter the string ");
    Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    System.out.println(ispalindrome(s,0,s.length()-1));
    
   }
}
