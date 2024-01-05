//to palindromenumber
import java.util.Scanner;
class PalindromeNumber
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;//to hold number
int rd=0;//to hold reverse of digit
System.out.println("Enter a positive integer:");
n=sc.nextInt();
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
if(num==rd)
{
System.out.println("Palindrome");}
else{
System.out.print("Not Palindrome");
}
}
}


                              