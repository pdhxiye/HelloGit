package com.pdh.pojo;

/**
 * @author pdh
 * @create 2021-02-06-15:00
 */
public class Student {
   private int studentId;
   private String studentName;
   private String password;
   private String grade;

   public Student() {
   }

   public Student(int studentId, String studentName, String password, String grade) {
      this.studentId = studentId;
      this.studentName = studentName;
      this.password = password;
      this.grade = grade;
   }

   public int getStudentId() {
      return studentId;
   }

   public void setStudentId(int studentId) {
      this.studentId = studentId;
   }

   public String getStudentName() {
      return studentName;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getGrade() {
      return grade;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   @Override
   public String toString() {
      return "Student{" +
              "studentId='" + studentId + '\'' +
              ", studentName='" + studentName + '\'' +
              ", password='" + password + '\'' +
              ", grade='" + grade + '\'' +
              '}';
   }
}
