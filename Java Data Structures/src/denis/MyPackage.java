package denis;

public class MyPackage {
    String name;
    double bal;

    MyPackage(String n,double b)
    {
        name = n;
        bal = b;
    }

    void show()
    {
        if(bal<0)
        {
            System.out.print("-->");
            System.out.println( name+" ,Ksh"+bal);
        }
    }

}

class AccountBalance{
    public static void main(String[] args)
    {
        MyPackage[] pack = new MyPackage[3];

        pack[0] = new MyPackage("Denis Muriungi",100000000);
        pack[1] = new MyPackage("Moreen Mwendwa",2000000);
        pack[2] = new MyPackage("Cosmos Mwenda",500000);

        for(int i =0; i<3; i++) pack[i].show();
    }
}
