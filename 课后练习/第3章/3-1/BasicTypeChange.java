public class BasicTypeChange{		//����һ�����λ�����������ת������
	public static void main(String[] args) {
		byte b = 12;
		char c = 'b';
		short s = 13;
		int i = 567;
		long l = 678756;
		float ft = 23.67f;
		double db = 6.124d;
		//result����Ϊ�������ͻ�������ǽ�������ת��
		double result = (ft * b) + +(l * ft) + (i / c) - (db * s); 
		System.out.print(" ��� ��" + result+" = ");
		System.out.println((ft * b) + " + " + (l * ft) + " + " + (i / c) + " - "
				+ (db * s));		//���뾭�������õĽ��
	}
}
