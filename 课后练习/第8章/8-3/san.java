public class san {
        private String name;
        private int age;
        //���췽��һ
        public san() {
            this(null);
        }
        //���췽����
        public san(String n) {
            this(n, 12);//���õ�����
        }
        //���췽����
        public san(String n, int a) {
            this.name = n;
            this.age = a;
        }
    }