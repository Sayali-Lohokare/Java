interface Demo1 {
    static void fun(){
        System.out.println("in fun");
    }
}
interface Demo2{
    static void fun(){
        System.out.println("in fun");
    }
}
class DemoChild implements Demo1,Demo2{

}
class Client{
    public static void main(String[] args){
        Demo1.fun();
        Demo2.fun();
    }
}
