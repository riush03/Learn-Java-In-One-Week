public class PassingObjects {
    int a,b;

    PassingObjects(int i , int j)
    {
        a= i;
        b= j;
    }

    //pass an object
    void pass_meth(PassingObjects o)
    {
        o.a *= 2;
        o.b /= 2;
    }
}

class TestPass{
    public static void main(String[] args)
    {
        PassingObjects pass_obj = new PassingObjects(15,20);

        System.out.println("pass_obj.a and pass_obj.b before call "+pass_obj.a+" "+pass_obj.b);

        pass_obj.pass_meth(pass_obj);
        System.out.println("pass_obj.a and pass_obj.b before call "+pass_obj.a+" "+pass_obj.b);
    }
}
