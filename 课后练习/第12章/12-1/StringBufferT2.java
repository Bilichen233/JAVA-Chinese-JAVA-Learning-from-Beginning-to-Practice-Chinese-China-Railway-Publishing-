public class StringBufferT2{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ") ;		
		fun(buf) ;		// ����StringBuffer���� 
		System.out.println(buf) ;	// ��ӡ����
	}
	public static void fun(StringBuffer s){		// ����StringBuffer����
		s.append("CCC ").append("AAA") ;	// �޸�StringBuffer������
	}
};