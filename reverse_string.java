// palindrome and reversal of the string 
import java.util.Scanner;
public class reverse_string {
    public  static String reverse(String s,int index) {
    // base case
     if (index==s.length())
    return "";
    // recursive work 
    String p= reverse(s,index+1); 
    //self work
    return p+s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be reversed\n");
        String s=sc.nextLine();
    String rev= reverse(s, 0);
    if(rev.equals(s))
    System.out.println("ha palindrome hai    "+s);
    else
    System.out.println("nhi hai palindrome bhai "+s);
    System.out.println("your reversed sring is =  "+reverse(s, 0));
    sc.close();//for closing the object memory
    }                                                                                                                                                                                                                              
}
                                                                                                                                                                                                                                                                                                                                                                                                        