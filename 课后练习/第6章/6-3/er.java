public class er {
	    public static void main(String args[]) {
	        String string = "aaa456ac";  
	        //����ָ���ַ������ַ����е��±ꡣ���򷵻������ַ����±ꣻ�����򷵻�-1.  
	        System.out.println(string.indexOf("b")); // indexOf(String str); ���ؽ����-1��"b"������  
	 
	        // �ӵ��ĸ��ַ�λ�ÿ�ʼ����������ң�������ǰλ��  
	        System.out.println(string.indexOf("a",3));//indexOf(String str, int fromIndex); ���ؽ����6  
	 
	        //����֮ǰ�Ĳ������Ĳ����� String ���ͣ�����Ĳ����� int ���ͣ��ο����ݣ�a-97,b-98,c-99  
	 
	        // ��ͷ��ʼ�����Ƿ����ָ�����ַ�  
	        System.out.println(string.indexOf(99));//indexOf(int ch)�����ؽ����7  
	        System.out.println(string.indexOf('c'));//indexOf(int ch)�����ؽ����7  
	 
	        //��fromIndex����ch��������ַ��ͱ����������ַ������ַ�a��Ӧ�����־���97��  
	        System.out.println(string.indexOf(97,3));//indexOf(int ch, int fromIndex); ���ؽ����6  
	        System.out.println(string.indexOf('a',3));//indexOf(int ch, int fromIndex); ���ؽ����6  
	    }
}