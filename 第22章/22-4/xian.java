public class xian extends Thread
{
    public void run()
    {
        int n = 0;
        while ((++n) < 1000);        
    }
    public static void main(String[] args) throws Exception
    {
        xian thread1 = new xian();
        System.out.println("isAlive: " + thread1.isAlive());
        thread1.start();
        System.out.println("isAlive: " + thread1.isAlive());
        thread1.join();  // 等线程thread1结束后再继续执行 
        System.out.println("thread1已经结束!");
        System.out.println("isAlive: " + thread1.isAlive());
    }
}
