//addition of two numbers by scanner
import java.util.Scanner;
class Addition{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int num1=ob.nextInt();
int num2=ob.nextInt();
int sum=0;
System.out.println("num1="+num1);
System.out.println("num2="+num2);
sum =num1 + num2;
System.out.println(num1 +"+"+num2 +"="+sum);
}
}