
public class shuzuone1 {
	public static void main(String[] args) {		
		int[] X={12,13,24,77,68,39,60};//��������X,�г�ʼֵ
		int[] Y;	//��������Y,û�г�ʼֵ
		Y=X;		//������X��ֵ��������Y
		for(int i=0;i<X.length;i++)		//ѭ���������X��Y�е�Ԫ��
		{
			Y[i]++;
			System.out.println(X[i]);
			System.out.println(Y[i]);
		}
	}

}
