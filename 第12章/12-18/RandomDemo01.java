import java.util.Random ;
public class RandomDemo01{
	public static void main(String args[]){
		Random r = new Random() ;		// ʵ????Random????
		for(int i=0;i<10;i++){
			System.out.print(r.nextInt(100) + "\t") ;
		}
	}
};