class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class BCA{
public static void main(String args[])
{
Student adarsh=new Student();
adarsh.setId(25935);
System.out.println("id:"+adarsh.getId());
}
}

