
public class breakyou {
	public static void main(String args[]){
		    out:for(int X=0;X<10;X++){
		        System.out.println("X="+X);
		        for(int Y=0;Y<10;Y++){
		            if(Y==7){
		                break out;
		              }
		            System.out.println("Y="+Y);
		          }
		      }
		}

}
