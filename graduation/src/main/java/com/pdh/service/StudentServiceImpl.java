package com.pdh.service;

import com.pdh.dao.StudentMapper;
import com.pdh.pojo.Student;

/**
 * @author pdh
 * @create 2021-02-08-10:04
 */
public class StudentServiceImpl implements StudentService{
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student registerStudent(Student student) {
        return studentMapper.queryStudentByIP(student.getStudentId(),student.getPassword());
    }
    @Override
    public boolean queryStudentById(int studentId) {
        if (studentMapper.queryStudentById(studentId)==null){
            return false;
        }
        return true;
    }

    @Override
    public Student queryStudentById1(int studentId) {
        return studentMapper.queryStudentById(studentId);
    }

    @Override
    public boolean queryStudentByIN(int studentId, String studentName) {
        if (studentMapper.queryStudentByIN(studentId,studentName)==null){
            return false;
        }
        return true;
    }

}
