public class ThreadFlag extends Thread{
    public volatile boolean exit = false;
    public void run(){
        while (!exit);
    }
    public static void main(String[] args) throws Exception{
        ThreadFlag thread = new ThreadFlag();
        thread.start();
        sleep(5000); // ���߳��ӳ�5��
        thread.exit = true;  // ��ֹ�߳�thread
        thread.join();
        System.out.println("��ֹ�̣߳����Խ���!");
    }
}
