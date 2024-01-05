class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
private String name;
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class BCA{
public static void main(String args[])
{
Student adarsh=new Student();
adarsh.setId(25935);
adarsh.setName("ZOYA");
System.out.println("id:"+adarsh.getId());
System.out.println("name:"+adarsh.getName());
}
}