import java.util.Scanner;
import java.io.IOException;
class max_in_array{
public static int maximum(int arr[],int idx) 
{
    if(idx == arr.length)
    return 0;
    int ans=maximum(arr, idx+1);
    return Math.max(arr[idx],ans);
}
    public static void main(String...args) throws IOException,InterruptedException{
      new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner sc =new Scanner(System.in);
        int[] arr=new int [4];
        System.out.println("enter the element..  (approx or less than 4)");
         for(int i=0;i<4;i++)
         arr[i]=sc.nextInt();sc.close();
        System.out.println("the maximum is \t"+maximum(arr, 0));
    }
}