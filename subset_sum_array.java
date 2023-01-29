//on the basis of the choice include or exclude 
import java.util.Scanner;
public class subset_sum_array {
  public static void sum( int[] arr,int index,int subset_sum ){
       //base case 
       if(index==arr.length)
       {System.out.println(subset_sum);
        return ;}

       //recursive work 
       sum(arr, index+1, subset_sum+arr[index]);//if the cuurent index element is added 
       sum(arr, index+1, subset_sum);//not added 
        //self work 
        //there is no self wor 
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("array ki size ");
      int n =sc.nextInt(); 
     int a[]=new int[n];
      System.out.println("array ke element bol");
      for(int i=0;i<n;i++)
      { a[i]=sc.nextInt();}
      System.out.println("yah rahe tere subset ke sum (mast re)");
      sum(a, 0, 0);
      sc.close();
    }
    
    }