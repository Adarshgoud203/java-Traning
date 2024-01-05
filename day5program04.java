//even or odd with the if else 
import java.util.*;
class Program201{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+ "Even\n");
}
else
{
System.out.println("Odd\n");
System.out.println(n+  "Odd\n");
}
}
}