class Book{
private String student_name;
private String class_study;
private int class_start;
private int clas_end;
private int class_section;
private String student_name;
private String course_name;

public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setClass_study(String class_study)
{this.class_study=class_study;}
public void set_start(int ay_start)
{this.ay_start=ay_start;}
public void setAy_end(int ay_end)
{this.ay_end=ay_end;}
public void setId(int id)
{this.id=id;}
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setCourse_name(String course_name)
{this.course_name=course_name;}
public void setAadhar_no(String co_no)
{this.aadhar_no=aadhar_no;}

public String getCollege_name(){return college_name;}
public String getCollege_address(){return college_address;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public String getAadhar_no(){return aadhar_no;}
}
class BCA{
public static void main(String args[])
{
Icard ob=new Icard();
ob.setCollege_name("MOTHER THERESA ENGINEEERING COLLEGE");
ob.setCollege_address("MELUMOI,PALAMANER,517408");
ob.setAy_start(2021);
ob.setAy_end(2026);
ob.setId(27908);
ob.setStudent_name("ADARSH");
ob.setCourse_name("ECE");
ob.setAadhar_no("526278952568");
System.out.println(ob.getCollege_name());
System.out.println(ob.getCollege_address());
System.out.println("A.Y"+ob.getAy_start()+"-"+ob.getAy_end());
System.out.println("ID. "+ob.getId());
System.out.println(ob.getStudent_name());
System.out.println(ob.getCourse_name());
System.out.println(ob.getAadhar_no());
}
}

