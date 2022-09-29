import java.util.concurrent.TimeUnit;

public class SampleThread extends Thread{
    private String param;

    public  SampleThread(String threadParam)
    {
        this.param = threadParam;
    }

    private static void pauseOneSecond()
    {
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void run()
    {
        while (!"exit".equals(param))
        {
            System.out.println((isDaemon() ? "daemon":"user")+"thread"+this.getName()+"(id="+this.getId()+")parameter :"+param);
            pauseOneSecond();
        }
        System.out.println((isDaemon() ? "daemon":"user")+"thread"+this.getName()+"(id="+this.getId()+")parameter :"+param);
    }
    public void setParam(String param)
    {
        this.param = param;
    }

    public static void main(String[] args)
    {
        SampleThread sampleThread = new SampleThread("one");
        sampleThread.start();
        SampleThread sampleThread1 = new SampleThread("two");
        sampleThread1.setDaemon(true);
        sampleThread1.start();
        pauseOneSecond();
        sampleThread1.setParam("exit");
        pauseOneSecond();
        System.out.println("Exiting main thread");
    }
}


