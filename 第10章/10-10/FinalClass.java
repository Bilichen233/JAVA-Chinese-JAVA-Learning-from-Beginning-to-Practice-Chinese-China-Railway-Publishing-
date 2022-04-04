final class FinalClass {//定义类FinalClass，使用final修饰 
	int a = 139;		//定义变量a的初始值是139		
	void doit() {		//定义方法doit()
	}
	
    public static void main(String args[]) {
		FinalClass f = new FinalClass();
		f.a++;			//变量a的值递增加1
		System.out.println("贾玲的体重是"+f.a+"斤吗？");
	}
}
