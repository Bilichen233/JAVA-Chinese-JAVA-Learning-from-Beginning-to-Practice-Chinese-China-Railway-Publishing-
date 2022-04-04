public class WithFinally {  
  public void methodA(int status)throws Exception{  	//定义方法methodA
    if(status==-1) throw new Exception("云青道长"); 		//如果status==-1则抛出异常 
    System.out.println("云青道捉拿胡巴成功！");  				//输出信息
  }  
 
  public static void main(String args[]) throws Exception{  
    try{  
      new WithFinally().methodA(-1); 	//抛出Exception异常  
      System.out.println("捕妖亭亭主的五期很不错！");		//输出信息
    }catch(Exception e){  
      System.out.println("屠四谷改邪归正，");  			//输出信息
    }finally{  
      System.out.println("成功消灭了云青道长证监会各大卧底~");	//输出信息  
    }  
  }  
} 
