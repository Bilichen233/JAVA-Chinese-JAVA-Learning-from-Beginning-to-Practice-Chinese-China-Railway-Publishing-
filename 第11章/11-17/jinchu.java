import java.util.Stack;
public class jinchu {
 public static void main(String args[]) {
	 // ʵ����Stack����
	 Stack<String> s = new Stack<String>();
	 s.push("Pixel");		// ��ջ	
	 s.push("Pixel L");		// ��ջ
	 s.push("Pixel 2");	// ��ջ

	 System.out.print(s.pop() + "��");	//��ջ
	 System.out.print(s.pop() + "��");	//��ջ
	 System.out.println(s.pop() + "��");	// ��ջ
	 System.out.print(s.pop() + "��");	// ��ջ
	 // ���󣬳�ջ�������쳣��ջΪ��
 }
}
