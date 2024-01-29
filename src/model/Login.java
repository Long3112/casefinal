package model;

import java.util.ArrayList;
import java.util.List;

public class Login {
    private String studentUsernames;
    private String studentPasswords;
    private String teacherUsernames;
    private String teacherPasswords;
    public Login() {

    }

    public Login(String studentUsernames, String studentPasswords, String teacherUsernames, String teacherPasswords) {
        this.studentUsernames = studentUsernames;
        this.studentPasswords = studentPasswords;
        this.teacherUsernames = teacherUsernames;
        this.teacherPasswords = teacherPasswords;
    }




    public String getStudentUsernames() {
        return studentUsernames;
    }

    public void setStudentUsernames(String studentUsernames) {
        this.studentUsernames = studentUsernames;
    }

    public String getStudentPasswords() {
        return studentPasswords;
    }

    public void setStudentPasswords(String studentPasswords) {
        this.studentPasswords = studentPasswords;
    }

    public String getTeacherUsernames() {
        return teacherUsernames;
    }

    public void setTeacherUsernames(String teacherUsernames) {
        this.teacherUsernames = teacherUsernames;
    }

    public String getTeacherPasswords() {
        return teacherPasswords;
    }

    public void setTeacherPasswords(String teacherPasswords) {
        this.teacherPasswords = teacherPasswords;
    }
}
