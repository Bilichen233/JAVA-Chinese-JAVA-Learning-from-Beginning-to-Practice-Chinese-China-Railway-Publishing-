import static java.lang.System.out;
//在调用方法的时候，如果能够和固定参数的方法匹配，也能够与可变长参数的方法匹配，则选择固定参数的方法。看下面代码的输出：
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