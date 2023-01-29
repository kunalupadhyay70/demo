class arrysum {
    public static int display(int arr[],int i) {
        if (i==arr.length-1)
        return arr[i];
         int n= display(arr,i+1);
        return n+arr[i];  
     //   return arr[i];
    
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
       System.out.println( display(arr,0));



    }
}