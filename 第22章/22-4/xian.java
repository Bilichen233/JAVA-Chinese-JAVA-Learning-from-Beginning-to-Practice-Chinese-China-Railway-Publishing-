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
        thread1.join();  // ���߳�thread1�������ټ���ִ�� 
        System.out.println("thread1�Ѿ�����!");
        System.out.println("isAlive: " + thread1.isAlive());
    }
}
