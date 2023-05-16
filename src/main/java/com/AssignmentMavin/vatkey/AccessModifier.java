package com.AssignmentMavin.vatkey;

public class AccessModifier {
    String prop1;
    private String prop2;
    protected  String prop3;
    public  String prop4;
    public  String getProp1(){
        return prop1;
    }
    public static float DatModi(float h1){
        return  h1 + 3444.98f + 34.98f;
    }
    private void method2(){

    }
    protected void method3(){}
    public void  method4(){}
    class A1{

    }
    private class A2{
        private static String prat = "inner class static";
        public  float hog1 = 76.876f;
        public  void methodA2Void(){
            System.out.println("i am inside an inner private class");
        }
    }
    protected  class A3 {
       public static void protectedMethod()
        {
            System.out.println("this is from the protected class A3");
        }
    }
    public class A4{

    }
    interface I1{

    }
    private interface I2{

    }
    protected  interface  I3{

    }
    public interface I4{

    }
    private void method6(){
        String sd = A2.prat;
    }
}
