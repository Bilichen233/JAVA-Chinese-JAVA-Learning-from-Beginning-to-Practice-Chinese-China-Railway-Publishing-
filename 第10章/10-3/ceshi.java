public class ceshi{
	public static void main(String[] args) {
		//����helloʱʹ��Object�࣬��hello�ı���������Object��Object��������ĸ���
		//��hello������ʵ��������String
		Object hello = "Hello";
		//String��Object������࣬���Է���true��
		//����ַ����Ƿ���Object���ʵ��
		System.out.println((hello instanceof Object));
		//����ַ����Ƿ���String���ʵ��
		System.out.println((hello instanceof String));
		//����ַ����Ƿ���Math���ʵ��
		System.out.println((hello instanceof Math));
		//Stringʵ����Comparable�ӿڣ����Է���true��
		//����ַ����Ƿ���Comparable�ӿڵ�ʵ����"
		System.out.println((hello instanceof Comparable));
		//String a = "Hello";
		//String��Ȳ���Math�࣬Ҳ����Math��ĸ��࣬���������������޷�ͨ��
		//System.out.println("�ַ����Ƿ���Math���ʵ����" + (a instanceof Math));
	}
}
