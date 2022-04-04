public class san {
        private String name;
        private int age;
        //构造方法一
        public san() {
            this(null);
        }
        //构造方法二
        public san(String n) {
            this(n, 12);//调用第三个
        }
        //构造方法三
        public san(String n, int a) {
            this.name = n;
            this.age = a;
        }
    }