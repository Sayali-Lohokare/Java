class Parent {
    Parent(){
        System.out.println("In OArent Constructor");
    } 
    void fun(){
        System.out.println("In fun");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }
    void gun(){
        System.out.println("In gun");
    }
}
class Client{
    public static void main(String[] args){
        Child obj = new Child();
        obj.fun();
        obj.gun();

        Parent obj1 = new Parent();
        obj1.fun();
       // obj1.gun();
        
    }
}
