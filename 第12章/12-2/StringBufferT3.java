public class StringBufferT3{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Java") ;		// �������
		buf.insert(0,"��ѧϰ") ;		// �ڵ�һ������֮ǰ�������
		System.out.println(buf) ;
		buf.insert(buf.length(),"3�����ˣ�") ;	// ������������
		System.out.println(buf) ;
	}
};