package com.pdh.dao;

import com.pdh.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-06-15:04
 */
public interface StudentMapper {


    Student queryStudentByIP(@Param("studentId") int studentId,@Param("password") String password);
    Student queryStudentById(int studentId);

    Student queryStudentByIN(@Param("studentId") int studentId,@Param("studentName") String studentName);

}
