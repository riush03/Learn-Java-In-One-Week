abstract class Muriungi {

    void callmetoo()
    {
        System.out.println("This is a concrete method");
    }
}

class Denis extends Muriungi{
    void callme()
    {
        System.out.println("Dens's implementation of callme");
    }
}

class AbstractDemo{
    public static void main(String[] args)
    {
        Denis denis = new Denis();

        denis.callme();
        denis.callmetoo();
    }
}
