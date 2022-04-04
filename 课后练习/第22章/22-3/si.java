public class si {
    int a = 1;
    boolean status = false;

    /**
     * ×´Ì¬ÇÐ»»Îªtrue
     */
    public void changeStatus(){
        a = 2;//1
        status = true;//2
    }

    /**
     * Èô×´Ì¬Îªtrue£¬Ôòrunning¡£
     */
    public void run(){
        if(status){//3
            int b = a+1;//4
            System.out.println(b);
        }
    }
}