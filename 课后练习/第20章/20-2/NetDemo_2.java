import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo_2 {
	public static void main(String[] args) {
		try {
			InetAddress ind = InetAddress.getByName("192.108.33.32");
			System.out.println(ind.getHostName());
			InetAddress ind1 = InetAddress.getByName("www.sina.com");
			System.out.println(ind1);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}
