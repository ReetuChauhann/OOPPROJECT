class Z{
           static int x;
      void m() {
    x++;
            System.out.println(x);
  }
          static void setX(int a) {
   x=a;
 }
 }
         public class StaticAssignment1 
         {
    public static void main(String[] args) 
    {
          Z a= new Z();
         System.out.println(a.x);     //0
       a.m();                        //1
     Z.setX(15);                    // 15 stored here 
     a.m();                        // x++ makes this value 16 ......
 }
    }


