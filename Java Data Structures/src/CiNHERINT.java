public class CiNHERINT {
    //use of super
    int i;
}

class C extends CiNHERINT{
    int i; // this i hides the i in Cinherent

    C(int a,int b)
    {
        super.i = a; //access the i in A class
        i=b; //i in B
    }

    void show(){
        System.out.println("The i in superclass"+super.i);
        System.out.println("The i in subclass "+i);
    }
}

class UseSuper{
    public static void main(String[] args)
    {
        C sub_ub = new C(1,2);

        sub_ub.show();
    }
}