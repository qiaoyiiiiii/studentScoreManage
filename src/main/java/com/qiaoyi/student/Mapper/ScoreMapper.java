package com.qiaoyi.student.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.qiaoyi.student.Entity.Grades;
import com.qiaoyi.student.Entity.Score;
import com.qiaoyi.student.Entity.Teachers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Grades> {
    @Select("SELECT grades.*, students.name,students.college,students.studentclass,students.major,students.grade,subquery.course_name,subquery.name AS teacher FROM grades\n" +
            "LEFT JOIN students ON grades.student_id = students.student_id " +
            "LEFT JOIN (SELECT teaching.teaching_id,courses.course_name,teachers.name FROM teaching "+
            "INNER JOIN courses ON teaching.course_id = courses.course_id "+
            "INNER JOIN teachers ON teaching.teacher_id=teachers.teacher_id )"+
            " AS subquery ON grades.teaching_id = subquery.teaching_id ${ew.customSqlSegment}")
    public IPage<Score> pageCC(IPage page, @Param(Constants.WRAPPER) Wrapper<Score> wrapper);

    @Select("SELECT grades.*, students.name,students.college,students.studentclass,students.major,students.grade,subquery.course_name,subquery.name AS teacher FROM grades\n" +
            "LEFT JOIN students ON grades.student_id = students.student_id " +
            "LEFT JOIN (SELECT teaching.teaching_id,courses.course_name,teachers.name FROM teaching "+
            "INNER JOIN courses ON teaching.course_id = courses.course_id "+
            "INNER JOIN teachers ON teaching.teacher_id=teachers.teacher_id )"+
            " AS subquery ON grades.teaching_id = subquery.teaching_id ${ew.customSqlSegment}")
    public List<Score> out(@Param(Constants.WRAPPER) Wrapper<Score> wrapper);
}
