package com.qiaoyi.student.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Score extends Grades{
private String name;
private String college;
private String studentclass;
private String major;
private Integer grade;
private String course_name;
private String teacher;

public Score() {
    super();
}

    public Score(Integer gradeId, Integer studentId, Integer teachingId, Integer semesterId, BigDecimal score, String academic_year,String name, String college, String studentclass,
                 String major, Integer grade, String course_name,String teacher) {
        super(gradeId, studentId, teachingId, semesterId, score, academic_year);
        this.name = name;
        this.college = college;
        this.studentclass = studentclass;
        this.major = major;
        this.grade = grade;
        this.course_name = course_name;
        this.teacher = teacher;
    }


    // 添加全参数构造函数
//    public Score(Integer studentId, Integer teachingId, Integer semesterId, BigDecimal score, // 这些是父类 Grades 的属性
//                 String academic_year,String name, String college, String studentclass,
//                 String major, Integer gradeId, String course_name) { // 这些是子类 Score 的属性
//
//        this.name = name;
//        this.college = college;
//        this.studentclass = studentclass;
//        this.major = major;
//        this.grade = grade;
//        this.course_name = course_name;
//    }
}
