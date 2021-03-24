package com.pdh.pojo;

/**
 * @author pdh
 * @create 2021-02-08-11:48
 */
public class Teacher {
    private int teacherId;
    private String teacherName;
    private String password;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, String password) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.password = password;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
