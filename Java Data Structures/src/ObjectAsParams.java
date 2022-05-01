public class ObjectAsParams {
    int a,b;

    ObjectAsParams(int i,int j)
    {
        a = i;
        b = j;
    }

    //return true if 0 is equal to the invocking obj
    boolean equalTo(ObjectAsParams o)
    {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

class TestOverload{
    public static void main(String[] args)
    {
        ObjectAsParams ob1 = new ObjectAsParams(100,22);
        ObjectAsParams ob2 = new ObjectAsParams(100,22);
        ObjectAsParams ob3 = new ObjectAsParams(40,5);

        System.out.println("ob1 == ob2 "+ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 "+ob1.equalTo(ob3));
    }
}
