public class JoinThread extends Thread
{
    public static volatile int n = 0;
    public void run()
    {
        for (int i = 0; i < 10; i++, n++)
            try
            {
                sleep(3);  // Ϊ��ʹ���н����������ӳ�3����
            }
            catch (Exception e)
            {
            } 
    }
    public static void main(String[] args) throws Exception
    {
        Thread threads[] = new Thread[100];
        for (int i = 0; i < threads.length; i++)  // ����100���߳�
            threads[i] = new JoinThread();
        for (int i = 0; i < threads.length; i++)   // ���иղŽ�����100���߳�
            threads[i].start();
        if (args.length > 0)  
            for (int i = 0; i < threads.length; i++)   // 100���̶߳�ִ��������
                threads[i].join();
        System.out.println("n=" + JoinThread.n);
    }
}
