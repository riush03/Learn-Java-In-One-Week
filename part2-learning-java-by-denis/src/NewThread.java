public class NewThread implements Runnable{
    Thread thread;

    NewThread()
    {
        //create a new second thread
        thread = new Thread(this,"Demo Read");
        System.out.println("Child thread :"+thread);
    }

    //This is the entry point for the second thread
    public void run()
    {
        try{
            for(int i = 5; i>0; i--)
            {
                System.out.println("Child thread :"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Child thread was interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

class NewThreadDemo{
    public static void main(String[] args)
    {
        NewThread newThread = new NewThread();

        //start the thred
        newThread.thread.start();

        try{
            for (int i =5; i>5; i--)
            {
                System.out.println("Main thread :"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Exiting main thread");
    }
}