import java.util.Arrays;
public class shuzugong7 {
	public static void main(String[] args) 
	{
			int size=0;//����int���ͱ���size�ĳ�ʼֵ��0
			if(args.length!=0)	//�������args���Ȳ�Ϊ0
				size=Integer.parseInt(args[0]);	//ǿ��ת��Ϊ����
			int[]a1=new int[size];	//�½�����a1
			Arrays.fill(a1, 11);	//�������11
			for(int i=0;i<a1.length;i++){					//��������
				System.out.print("a1["+i+"]="+a1[i]+" ");	//�������a�е�Ԫ��
			}
			System.out.println();
		}

}
