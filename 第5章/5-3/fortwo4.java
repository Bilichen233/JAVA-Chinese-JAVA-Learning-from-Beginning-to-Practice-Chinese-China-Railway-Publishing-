public class fortwo4 {
    public static void main(String[] args) {
        //���Ȱ����ο������£���������,���Ե�һ��for��5�Σ��ڶ���for4��
        for(int i=1;i<=5;i++){
        //���ո��*�ֿ�������" "�ı仯i=1ʱ������4 ��2��ʱ����3�ҹ���
            for(int j=1;j<=5-i;j++)
              System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)//�ҹ��ɣ�i�� 1 3 5 7 ������
              System.out.print('*');
            //��һ��
            System.out.println();
        }
         for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)//�ո� 1 2 3 4 so
              System.out.print(" ");
            for(int k=7;k>=2*i-1;k--)//* 7 5 3 1�������Ļ���
              System.out.print('*');
              System.out.println();
        }
    }
}







