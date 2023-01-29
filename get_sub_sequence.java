import java.util.ArrayList;
/* print the sub sequence in the arrayist 
 * ss="abc"
 */
public class get_sub_sequence {
    public static  ArrayList<String> getssq(String s) {
        ArrayList<String> ans =new ArrayList<>();
        // base case 
        if(s.length()==0)
        { ans.add("");
            return ans;}
        // recursive wok 
       char curr=s.charAt(0);
       ArrayList<String> smallans =getssq(s.substring(1 ));
    //    self work 
    // smallans =["bc","b","c",""]
    //ans =["bc","abc","b","ab","c","ac","","a"]
    for(String ss:smallans){
        ans.add(ss);
        ans.add(curr+ss);
    }
    return ans;
    }
public static void main(String[] args) {
    ArrayList<String> ans= getssq("abc");
    for (String s : ans) {
        System.out.println(s);
        
    }
}
}
