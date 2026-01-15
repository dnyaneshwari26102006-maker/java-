 class student 
{
 int rollno;
 String name;
 int marks;
 
//  method to set student data
void setdata(int r,String n,int m)
{
  rollno = r;
  name = n;
  marks = m;
}
// method to display data
void show()
{
  System.out.println(rollno + " "+name+ " "+marks);
}
}
public class ArrayObject1
{
  public static void main(String args[])
{
  // Array of student object
  student[] students = new student[2];

  // first student
  students[0] = new student();
  students[0].setdata(1,"abc",85);

  // second student
  students[1]=new student();
  students[1].setdata(2,"pqr",92);

  // dispaly student detail
  for(student s : students)
  {
    s.show();
  }
}
}
