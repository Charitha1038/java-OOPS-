import java.util.Scanner;
class Student{
   String usn;
   String name;
   void accept(){
      Scanner sc= new Scanner(System.in);
      System.out.print("enter usn:");
      usn=sc.nextLine();
      System.out.print("enter name:");
      name=sc.nextLine();
      }
    void display(){
      System.out.println("USN:"+usn);
      System.out.println("Name:"+name);
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Student s1=new Student();
      Student s2=new Student();
      System.out.println("Enter details of student1:");
      s1.accept();
      System.out.println("Enter details of student2:");
      s2.accept();
      System.out.println("Student1");
      s1.display();
      System.out.println("Student2");
      s2.display();
    }
 }
      