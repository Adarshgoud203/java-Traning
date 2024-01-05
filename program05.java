class B
{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(int x){
System.out.println("Main method with argument called"+x*2);
}
public static void main(String s){System.out.println("welcome "+s);}
public static void main(String args[]){
System.out.println("Adarsh is typing");
main();
main("ADARSH");
main(20);
}

}
