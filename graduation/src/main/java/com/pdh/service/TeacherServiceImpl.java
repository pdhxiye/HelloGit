package com.pdh.service;

import com.pdh.dao.TeacherMapper;
import com.pdh.pojo.Teacher;

/**
 * @author pdh
 * @create 2021-02-08-12:06
 */
public class TeacherServiceImpl implements TeacherService {
    private TeacherMapper teacherMapper;

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public Teacher queryTeacherBYIP(Teacher teacher) {
        return teacherMapper.queryTeacherByIP(teacher.getTeacherId(),teacher.getPassword());
    }
}
