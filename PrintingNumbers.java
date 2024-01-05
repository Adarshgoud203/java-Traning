//0+5+10+15+.....+100
//using for loop
import java.io.*;
class Test
{
public static void main(String args[])
     {
	int sum=0;
	for(int i=0;i<=100;i=i+5)
	{
	System.out.print(i+"+");
	sum=sum+i;
	}//while
	System.out.println("\b"+"="+sum);
     }//main()
}