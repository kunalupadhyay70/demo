import java.io.IOException;
class kunal 
{
    // private int age ;
    //  private int umr;
    //  public int getAge() {
    //     return age;
    // }
   // public void setAge(int age) {   //yeh getter  and setters wala method hai
    //     this.age = age;
    // }
    // public int getUmr() {
    //     return umr;
    // }
    // public void setUmr(int umr) {
    //     this.umr = umr;
    // }
    
   void  add(){
        System.out.println("yeh void wala method hai ");
        System.out.println(0);
    }
     void add (int a){
        System.out.println("yeh 1 parameter wala method ha");
        System.out.println(a);
      
    }
      void add (int a, int b){
        System.out.println("yeh two parameter constructor hai");
        int c= a+b;
        System.out.println(c);
        
    }
    public static void main(String...args) throws IOException,InterruptedException{
       new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        kunal ku= new kunal();
        // kunal u= new kunal(3);
        // kunal k= new kunal(2,3);
          ku.add();
          ku.add(8);
          ku.add(9,9);
        
    }
}


