public class DispatchMethod {
    void callme()
    {
        System.out.println("I am the father");
    }
}

class Mother extends DispatchMethod{
    //override callme()
    void callme()
    {
        System.out.println("I am the mother");
    }
}

class Child extends Mother{
    //overide callme()
    void callme()
    {
        System.out.println("I am the Child");
    }
}

class Father{
    public static void main(String[] args)
    {
        DispatchMethod father = new DispatchMethod();
        Mother mum = new Mother();
        Child child = new Child();

        DispatchMethod r; //Optaine a reference of type DispatchMethod
        r = father;
        r.callme();

        r = mum;
        r.callme();

        r = child;
        r.callme();


    }
}
