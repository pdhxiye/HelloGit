package com.pdh.dao;

import com.pdh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author pdh
 * @create 2021-02-08-11:58
 */
public interface TeacherMapper {
    //查询老师
    Teacher queryTeacherByIP(@Param("teacherId") int teacherId, @Param("password") String password);
}
