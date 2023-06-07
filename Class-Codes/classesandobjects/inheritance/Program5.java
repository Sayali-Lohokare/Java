class Parent {
    int x = 10;
    static int y = 20;

    Parent(){
        System.out.println("PArent");
    }
    void fun(){
        System.out.println("in fun");
    }
    static void run(){
        System.out.println("in static fun");
    }
}
class Child extends Parent{
}

class Client{
    public static void main(String[] args){
        Child obj = new Child();

        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        obj.run();
    }
}