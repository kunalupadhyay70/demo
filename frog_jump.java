public class frog_jump {
    //program to find the minimum cost of travelling when frog can jump only 1 index and अगला index
    public static int best(int [] h,int idx)
    {
        //base case 
        if (idx==h.length-1)
        return 0;
        //recursive work 
        int op1=Math.abs(h[idx]- h[idx+1])+ best(h,idx+1);//for jumping on following index 
            if (idx==h.length-2) return op1;
        int op2=Math.abs(h[idx]- h[idx+2])+ best(h,idx+2);//absolute value (abs function) jumping 1 index
         
        return Math.min(op1,op2); //returning the last value 

        //self work 
    }
     public static void main(String[] args) {
        int [] a={10,15,40,15};
        System.out.println(best(a,0));

     }
    }
