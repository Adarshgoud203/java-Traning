//to palindromeString
import java.util.Scanner;
class PalindromeString
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
if(n.equals(rs)){
System.out.println("Palindrome");}
else{
System.out.print("Not Palindrome");
}
}
}


                              