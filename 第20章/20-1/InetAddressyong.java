import java.net.*;
public class InetAddressyong{
	public static void main(String[] args)
		throws Exception{
		//根据主机名来获取对应的InetAddress实例
		InetAddress ip = InetAddress.getByName("www.baidu.com");
		//判断是否可达
		System.out.println("A：小鸟啊，你能访问百度吗？" + ip.isReachable(2000)); 
		//获取该InetAddress实例的IP字符串
		System.out.println(ip.getHostAddress());
		//根据原始IP地址来获取对应的InetAddress实例
		InetAddress local = InetAddress.getByAddress(new byte[]
		{127,0,0,1});
		System.out.println("B：你能访问本地服务器吗？" + local.isReachable(5000)); 
		//获取该InetAddress实例对应的全限定域名
		System.out.println(local.getCanonicalHostName());		
	}
}
