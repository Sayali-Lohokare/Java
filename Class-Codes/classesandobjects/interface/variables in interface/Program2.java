interface Demo {
    int x = 10;

    void fun();
}
class DemoChild implements Demo{

    int y = x;    //ithe y madhe x chi value put zhali ahe
    public void fun(){
        System.out.println(x);   // ithe x fkt initialize zhalay mjnje fkt box banla ahe x sathi
        System.out.println(Demo.x);
    }
}
class Client{
    public static void main(String[] args){
        Demo obj = new DemoChild();
        obj.fun();
    }
}


// ithe interface madhe variables different work krtat, ithe apan kiti pn vela x print kela tr to navyane bipush hoil bcz to 
//interface madhla variable ahe. 
//interface madhe variables la stackframe vr jaga ek ghae adhi bheatte mhnjech
// x = 10 bipush
// invokespecial();
