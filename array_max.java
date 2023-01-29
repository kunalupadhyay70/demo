import java.util.Scanner;

class max_in_array{
public static int maximum(int arr[],int idx) 
{
    if(idx == arr.length)
    return 0;
    int ans=maximum(arr, idx+1);
    return Math.max(arr[idx],ans);
}
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        int[] arr=new int [4];
         for(int i=0;i<4;i++)
         arr[i]=sc.nextInt();sc.close();
        System.out.println("the maximum is \t"+maximum(arr, 0));
    }
}