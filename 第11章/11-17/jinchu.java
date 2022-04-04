import java.util.Stack;
public class jinchu {
 public static void main(String args[]) {
	 // 实例化Stack对象
	 Stack<String> s = new Stack<String>();
	 s.push("Pixel");		// 入栈	
	 s.push("Pixel L");		// 入栈
	 s.push("Pixel 2");	// 入栈

	 System.out.print(s.pop() + "、");	//出栈
	 System.out.print(s.pop() + "、");	//出栈
	 System.out.println(s.pop() + "、");	// 出栈
	 System.out.print(s.pop() + "、");	// 出栈
	 // 错误，出栈，出现异常，栈为空
 }
}
