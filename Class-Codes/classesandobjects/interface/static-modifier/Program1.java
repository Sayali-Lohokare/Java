interface Demo {
    static void fun(){
        System.out.println("in fun");
    }
}
class DemoChild implements Demo{

}
class Client{
    public static void main(String[] args){
        DemoChild obj = new DemoChild();
<<<<<<< Updated upstream
        obj.fun();
        Demo.fun();
        obj.fun()
=======
        //obj.fun();
        Demo.fun();
>>>>>>> Stashed changes

    }
}
