public class MultipleThreads implements Runnable{
    String name;//name of the thread
    Thread tread;

    MultipleThreads(String threadName)
    {
        name = threadName;
        tread = new Thread(this,name);
        System.out.println("New thread: "+tread);
    }

    //This is the entry point for the thread
    public void run()
    {
        try{
            for (int i =5; i>0; i--)
            {
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e)
        {
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+"Exiting");
    }
}

class MultiThreadDemo{
    public static void main(String[] args)
    {
        MultipleThreads multipleThreads1 = new MultipleThreads("one");
        MultipleThreads multipleThreads2 = new MultipleThreads("two");
        MultipleThreads multipleThreads3 = new MultipleThreads("Three");

        multipleThreads1.tread.start();
        multipleThreads2.tread.start();
        multipleThreads3.tread.start();

        try{
            //wait for the other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}