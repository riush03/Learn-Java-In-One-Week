import java.util.concurrent.Callable;

public class CallMe {
    void call(String msg)
    {
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    Caller(CallMe targ,String s)
    {
        msg = s;
        target = targ;
        t = new Thread(this);
    }

    public void run()
    {
        synchronized (target) {
            target.call(msg);
        }
    }


}

class Synch{
    public static void main(String[] args)
    {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Sychronized");
        Caller ob3 = new Caller(target,"World");

        //start threads
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        //wait for the threads to end
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}