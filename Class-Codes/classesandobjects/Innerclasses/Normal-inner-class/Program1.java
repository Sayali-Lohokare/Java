class Outer {
    class Inner{
        void fun2(){
            System.out.println("fun2-inner");
        }
    }
    void fun1() {
        System.out.println("fun1-outer");
    }
    
}
class Client{
    public static void main(String[] args){

        Outer obj = new Outer();
        obj.fun1();

        Outer.Inner obj1 = obj.new Inner();
        obj.fun2();
    }
}
