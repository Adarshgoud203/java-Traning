//to reverse string
import java.util.Scanner;
class ReverseString
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;//to hold String
String rs="";//to hold reverse of String
//System.out.println("Enter a string:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.print(rs);
}
}


                                 