
public class shuzucopy {
	public static void main(String[] args) 
	{
		int X;		//����int����X
		//���岢��ʼ��int��������Y
		int Y[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		//���岢��ʼ��int��������Z
		int Z[] = new int[11];
		System.arraycopy(Y, 0, Z, 0, Y.length);	//��������Y�е�����Ԫ��
		for (X = 0; X < Y.length; X++)
			System.out.print(Z[X] + "\n");
		System.out.println();
	}
}
