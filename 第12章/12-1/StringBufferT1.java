public class StringBufferT1{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("�Ұ� ") ;					// ��StringBuffer���������
		buf.append("ѧϰ").append(" Java") ;		// ������������append()����
		buf.append("\n") ;						// ���һ��ת���ַ�
		buf.append("ѧϰ��").append(1).append("������\n") ;	// �������
		buf.append("�Ұ�ѧJava�� =").append(true) ;	// ��Ӳ���ֵ
		System.out.println(buf) ;			// ֱ��������󣬵���toString()
	}
};