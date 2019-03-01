public class testClass {

    testClass aClass;
     public testClass()
     {
         this.aClass = new testClass();
     }
     public static void main(String[] args)
     {
         aClass.aClass.aClass;
     }
}
