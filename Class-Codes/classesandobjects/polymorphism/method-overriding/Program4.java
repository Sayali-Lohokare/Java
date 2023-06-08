class Parent {
    Parent(){
        System.out.println("in parent constructor");
    }void fun(){
        System.out.println("in parent fun");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("in child constructor");
    }
    void fun(){
        System.out.println("in child fun ");
    }
}
class Client{
    public static void main(String[] args){
        Parent obj = new Child();
        obj.fun();
    }
}