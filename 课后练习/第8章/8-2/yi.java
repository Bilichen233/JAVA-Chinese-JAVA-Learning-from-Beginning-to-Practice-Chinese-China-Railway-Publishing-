import static java.lang.System.out;
//�ڵ��÷�����ʱ������ܹ��͹̶������ķ���ƥ�䣬Ҳ�ܹ���ɱ䳤�����ķ���ƥ�䣬��ѡ��̶������ķ��������������������
public class yi {

    public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }

    public void print(String test) {
        out.println("----------");
    }

    public static void main(String[] args) {
        yi test = new yi();
        test.print("hello");
        test.print("hello", "alexia");
    }
}