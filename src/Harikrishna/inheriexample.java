package Harikrishna;
//multilevel example
/*class parentcls {
    void pc()
    {
        System.out.println("this is parent class");
    }
}
// derived class 1
class childcls1 extends parentcls {
    void cc1()
    {
        System.out.println("child class 1");
    }}
//derived class 2
class childcls2 extends childcls1 {
    void cc2()
    {
        System.out.println("child class 2");
    }
}
public class inheriexample {
    public static void main(String[] args) {
        // object creation
        childcls2 b = new childcls2();
        b.pc();
        b.cc1();
        b.cc2();

    }}
 */
// hierarchical example
class parentcls {
   public static void pcc() {
        System.out.println ("this is parent cls");
    }}
class childcls1 extends parentcls {
  public static  void ccc1() {
        System.out.println("this is childclsss");
    }}
class childcls2 extends parentcls {
   public static void ccc2() {
        System.out.println(" hi this is childclsss2");
    }
}
public class inheriexample {
    public static void main(String[] args) {
        // object creation
      /* childcls2 c1 = new childcls2();
       childcls1 c2 = new childcls1();
       c1.ccc2();
       c2.ccc1();*/
        parentcls.pcc();
        childcls1.ccc1();
        childcls2.ccc2();
    }}


