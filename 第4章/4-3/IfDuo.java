public class IfDuo {
	public static void main(String args[]){
	int 总成绩 = 580;		//小鸟的成绩是580
	if(总成绩>610)			//如果成绩大于610
		System.out.println("成绩优秀，iPhone手机一部！");
	else if(总成绩>570) 	//如果成绩大于570小于等于610
		System.out.println("成绩很好，华为荣耀一部！");
	else if(总成绩>450) 	//如果成绩大于450小于等于570
		System.out.println("成绩还行，100元手机话费充值卡！");
	else if(总成绩>390) 	//如果成绩大于390小于等于450
		System.out.println("成绩一般，继续学习吧！");
	else					//如果成绩小于等于390
	System.out.println("成绩太差，不给你吃饭了！");
	System.out.println("检查完毕");

	}
}





