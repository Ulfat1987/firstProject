
package practice;

import java.util.Scanner;

public class Test {
  String studentName;
  String year = "2020";
  static int counter = 1000;
  String studentId;
  public Test() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your name");
      studentName = scan.next();
      setStudentId();
  }
    public static void main(String[] args) {
        Test student1 = new Test();
        System.out.println(student1.studentName + student1.studentId);//A20201001

        Test student2 = new Test();
        System.out.println(student2.studentName + student2.studentId);//B20201002
    }
    public void setStudentId(){
      counter++;
      this.studentId = year +""+counter;
    }
    }
