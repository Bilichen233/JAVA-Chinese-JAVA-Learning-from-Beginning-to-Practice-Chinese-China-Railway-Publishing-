public class ThreadFlag extends Thread{
    public volatile boolean exit = false;
    public void run(){
        while (!exit);
    }
    public static void main(String[] args) throws Exception{
        ThreadFlag thread = new ThreadFlag();
        thread.start();
        sleep(5000); // 主线程延迟5秒
        thread.exit = true;  // 终止线程thread
        thread.join();
        System.out.println("终止线程，面试结束!");
    }
}
