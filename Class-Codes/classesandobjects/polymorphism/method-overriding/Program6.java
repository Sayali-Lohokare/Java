class Parent {
    Parent(){
        System.out.println("in parent construtor");
    }
    void fun(int x){
        System.out.println("in parent fun");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("in child constructor");
    }
    void fun(){
        System.out.println("in child constructor");
    }
}
class Client{
    public static void main(String[] args){
        Parent obj = new Child();
        obj.fun();

    }
    
}
