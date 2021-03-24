package com.pdh.service;

import com.pdh.pojo.Student;

/**
 * @author pdh
 * @create 2021-02-08-10:03
 */
public interface StudentService {

    Student registerStudent(Student student);

    boolean queryStudentById(int studentId);

    Student queryStudentById1(int studentId);

    boolean queryStudentByIN(int studentId,String studentName);
}
