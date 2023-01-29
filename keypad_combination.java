public class keypad_combination {
    static void combination (String dig,String kp[],String res)
    {
        //base case 
        if (dig.length()==0){
            System.out.println(res +" ");
            return ;
        }
        int  currNum =dig.charAt(0) - '0';//to convet the string to the integer 
        String curchoice =kp[currNum];
        for(int i=0; i<curchoice.length(); i++)
        {
            combination(dig.substring(1),kp,res+curchoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig= "23";
        String kp[] ={ " ", " ", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, ""); 


    }
}
