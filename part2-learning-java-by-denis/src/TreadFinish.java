public class TreadFinish implements Runnable{
    String name;//name of the thread
    Thread t;

    TreadFinish(String thread_name)
    {
        name = thread_name;
        t = new Thread(this, name);
        System.out.println("New thread"+t);
    }

    public void run()
    {
        try{
            for(int i = 5; i>0; i--)
            {
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println(name+" was interrupted.");
        }
        System.out.println(name+" exiting");
    }
}

class JoinDemo{
    public static void main(String[] args)
    {
        TreadFinish treadFinish1 = new TreadFinish("one");
        TreadFinish treadFinish2 = new TreadFinish("two");
        TreadFinish treadFinish3 = new TreadFinish("three");

        treadFinish1.t.start();
        treadFinish2.t.start();
        treadFinish3.t.start();

        System.out.println("Thread one is alive "+treadFinish1.t.isAlive());
        System.out.println("Thread two is alive "+treadFinish2.t.isAlive());
        System.out.println("Thread three is alive "+treadFinish3.t.isAlive());

        //wait for the threads to finish
        try{
            System.out.println("Waiting for the threads to finish");
            treadFinish1.t.join();
            treadFinish2.t.join();
            treadFinish3.t.join();
        }catch (InterruptedException e)
        {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Thread one is alive "+treadFinish1.t.isAlive());
        System.out.println("Thread two is alive "+treadFinish2.t.isAlive());
        System.out.println("Thread three is alive "+treadFinish3.t.isAlive());

        System.out.println("Exiting thread");
    }
}