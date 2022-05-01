//Deadlock example
public class LockA {
    synchronized void foo(LockB b)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" enter A.foo");

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println(name+" trying to call B.last()");
        b.last();
    }

    synchronized void last()
    {
        System.out.println("Inside A.last");
    }
}

class LockB{
    synchronized void bar(LockA a)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered a B.bar");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println(name+" trying to call A.last()");
        a.last();
    }
    synchronized void last()
    {
        System.out.println("Inside B.last");
    }
}

class DeadLock implements Runnable{
    LockA lockA = new LockA();
    LockB lockB = new LockB();
    Thread t;

    DeadLock()
    {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this,"RacingThread");
    }

    void deadLockStart()
    {
        t.start();
        lockA.foo(lockB);
        System.out.println("Back in the main thread");
    }

    public void run()
    {
        lockB.bar(lockA);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args)
    {
        DeadLock dl = new DeadLock();
        dl.deadLockStart();
    }
}