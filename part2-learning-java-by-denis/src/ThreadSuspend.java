public class ThreadSuspend {
    String name;
    Thread t;
    boolean suspedFlag;

    ThreadSuspend(String threadName)
    {
        name = threadName;
        t = new Thread( this,name);
        System.out.println("Thread name:"+t);
        suspedFlag = false;
    }

    //entry point of te thread
    public void run()
    {
        try{
            for(int i =5; i>0; i--)
            {
                System.out.println(name+" : "+i);
                Thread.sleep(200);
                synchronized (this)
                {
                    while (suspedFlag)
                    {
                        wait();
                    }
                }
            }
        }catch (InterruptedException e)
        {
            System.out.println(name+"inrerrupted");
        }
        System.out.println(name+"exiting");
    }

    synchronized void mysuspend()
    {
        suspedFlag = true;
    }
    synchronized void myresume()
    {
        suspedFlag = false;
        notify();
    }

}

class SuspendResume{
    public static void main(String[] args)
    {
        ThreadSuspend suspendThread = new ThreadSuspend("one");
        ThreadSuspend suspendThread1 = new ThreadSuspend("two");

        //start the threads
        suspendThread.t.start();
        suspendThread1.t.start();

        try{
            Thread.sleep(1000);
            suspendThread.mysuspend();
            System.out.println("Suspending thread one");
            Thread.sleep(1000);
            suspendThread.myresume();
            System.out.println("Resuming thread one");
            suspendThread1.mysuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            suspendThread1.myresume();
            System.out.println("Resuming thread two");
        }catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
