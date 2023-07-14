interface A {
    int x = 10;
    
}
interface B{
    int x = 20;
}
class Child implements A,B{
    int x = 100;

    void fun(){
        System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
class Client{
    public static void main(String[] args){

        Child obj = new Child();
        obj.fun();
    }
}

//interface madhe jr aplyala diff methods madhub variables call karayche astil tr aplyala method chya navanech v calll krta 
//yetil nai kelyas ambiguity cha erroe yeto

//pn jr apan child class madhe vegla v. initialize kela asel tr without metod cha navv lihita call kela tr to javacha v.
//mhnjech child class madhla v. la call krto
