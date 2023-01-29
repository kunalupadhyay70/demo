
// space complexity of the code is  O(n^2)
// total no.of the subsequence is n^2
import java.util.Scanner;
public class print_sub_sequence {
    public static void printssq(String s,String currAns) //S="",cuurans=" abc"
    
    // base case 
    {if (s.length()==0)                     //true
   { System.out.println(currAns);            // abc
    return ;}                                //return
    char currChar= s.charAt(0); //currchar=c
    //there is two condition when character is selected or not
    // character added by its choice 
    String remstring=s.substring(1); //remstring =""
    printssq(remstring, currAns+currChar);//do choics printssq(""," abc")
    printssq(remstring, currAns); //do not choice 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("likh kiske tukde chahiye tuje ");
        String s=sc.nextLine();
        sc.close();
      System.out.println("le tere tukde , orr dagg atun");  printssq(s, "");
    }
}