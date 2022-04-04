import java.util.Scanner;
public class si
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("请输入一个正整数");
int m=sc.nextInt();


int sum=0; 
for(int i=1;i<=m;i++ )
{
if(i%2==1)
{
System.out.print(i+",");
sum+=i;
}
}
System.out.println("sum="+sum);
}
}