import java.util.*;

public class student {
  public static void main(String[] args) {
    stdnt s1 = new stdnt("Shantanu singh", 117, 95);
    stdnt s2 = new stdnt("Vaibhav singh", 125, 47);
    stdnt s3 = new stdnt("Sahil singh", 130, 27);
    s1.displayDetails();
    s1.calculateGrade();

    s2.displayDetails();
    s2.calculateGrade();

    s3.displayDetails();
    s3.calculateGrade();
  }
}

class stdnt {
  private String studentName;
  private int rollNumber;
  private int marks;

  stdnt(String studentName, int rollNumber, int marks) {
    this.studentName = studentName;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  void setName(String studentName) {
    this.studentName = studentName;
  }

  void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  void setMarks(int marks) {
    this.marks = marks;
  }

  String getStudentName() {
    return studentName;
  }

  int getRollNumber() {
    return rollNumber;
  }

  int getMarks() {
    return marks;
  }

  void displayDetails() {
    System.out.println(studentName + ", " + rollNumber + ", " + marks);
  }

  void calculateGrade() {
    if (marks >= 85) {
      System.out.println("A");
    } else if (marks >= 65) {
      System.out.println("B");
    } else if (marks >= 45) {
      System.out.println("C");
    } else if (marks >= 33) {
      System.out.println("D");
    } else {
      System.out.println("Fail");
    }
  }
}
