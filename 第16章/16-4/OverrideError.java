
class Message{					//������Message{

	public String tostring() {	//ԭ�����㸲дtoString()	
		return "Hello World .";	//�����ַ�����Hello World��
	}
}
public class OverrideError{
	public static void main( String[] args ){
		System.out.println( "������Ӣ�����˵�����ս��"+new Message() );//��ӡ���Message����
	}
}
