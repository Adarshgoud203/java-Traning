//java Program to illustrate unary NOT operator!
import java.util.Scanner;
class Test{
public static void main(String args[])
{
boolean cond=true;
Scanner ob=new Scanner(System.in);
int var1=ob.nextInt();
int var2=ob.nextInt();
System.out.println("cond is:"+cond);
System.out.println("var1 ="+var1);
System.out.println("var2 ="+var2);
System.out.println("Now cond is:"+!cond);
System.out.println("!(var1<var2)="+!(var1<var2));
System.out.println("!(var1>var2)="+!(var1>var2));
}
}
