public class BasicAutoChange {
		// �������͵��Զ�ת��
	public static void main(String[] args) { 
		char c = 'a';
		byte b = 44;
		short s0 = b;
		int i0 = s0;
		int i1 = c;
		long l = i0;
		float f = l;
		double d = f;
		float fl = 1.7f;
		double db = fl;
		System.out.println("fl = " + fl + "; dou = " + db);
		// һ������һ������ת��������һ�����ͣ���ת������ʱ��ֵ����һ����
		fl = (float) db;
		System.out.println("fl = " + fl + "; dou = " + db);
	}
}
