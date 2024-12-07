package com.qiaoyi.student.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaoyi.student.Entity.Grades;
import com.qiaoyi.student.Entity.Score;
import com.qiaoyi.student.Entity.Teachers;
import com.qiaoyi.student.Service.ScoreService;
import com.qiaoyi.student.Utils.QueryPageParam;
import com.qiaoyi.student.Utils.Result;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Resource
    private ScoreService scoreService;



    @GetMapping("/delete")
    public Result deleteScore(String id) {
        boolean flag = scoreService.removeById(id);
        return flag ? Result.success() : Result.fail();
    }

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdateScore(@RequestBody Grades grades) {
        boolean flag = scoreService.saveOrUpdate(grades);
        return flag ? Result.success() : Result.fail();
    }

    @PostMapping("/scoreout")
    public ResponseEntity<String> exportStudentGrades(@RequestBody Score score) {
        try {
            //学生筛选项及共有选项
            String academicYear = score.getAcademic_year();
            Integer semester = score.getSemester();
            String course = score.getCourse_name();
            //老师的筛选项
            String name = score.getName();
            String major = score.getMajor();
            Integer grade = score.getGrade();
            String studentClass = score.getStudentclass();
            String teacher = score.getTeacher();
            QueryWrapper<Score> queryWrapper = new QueryWrapper<>();


            //共有部分
            if(StringUtils.isNotBlank(course)){
                queryWrapper.eq("subquery.course_name",course);
            }
            //先选学年再选学期，但可以单独选学期
            if(StringUtils.isNotBlank(academicYear)){
                queryWrapper.eq("grades.academic_year",academicYear);
                if(semester != null){
                    queryWrapper.eq("grades.semester",semester);
                }
            }



            //教师端显示页面成绩
            if(StringUtils.isNotBlank(teacher)){
                queryWrapper.eq("subquery.name",teacher);
                //老师的筛选项
                if(grade != null){
                    queryWrapper.eq("students.grade",grade);
                }
                //先选专业专业才能选班，但可以单独选专业
                if(StringUtils.isNotBlank(major)){
                    queryWrapper.eq("students.major",major);
                    if(StringUtils.isNotBlank(studentClass)){
                        queryWrapper.eq("students.studentclass",studentClass);
                    }
                }

                if(StringUtils.isNotBlank(name)&&!name.equals("null")){
                    queryWrapper.like("students.name",name);
                }
            }     //学生显示成绩
            else if(StringUtils.isNotBlank(name)&&!name.equals("null")){
                queryWrapper.eq("students.name",name);
            }
            scoreService.out(queryWrapper);
            return ResponseEntity.ok("导出成功");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("导出失败");
        }
    }

    @PostMapping("/get")
    public Result getStudent(@RequestBody QueryPageParam query) {
        HashMap param = query.getParam();
        //学生筛选项及共有选项
        String academicYear = (String) param.get("academicYear");
        String semester = (String) param.get("semester");
        String course = (String) param.get("course");
        //老师的筛选项
        String name = (String) param.get("name");
        String major = (String) param.get("major");
        String grade = (String) param.get("grade");
        String studentClass = (String) param.get("studentClass");
        String teacher = (String) param.get("teacher");

        Page<Score> page = new Page<>();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());


        QueryWrapper<Score> queryWrapper = new QueryWrapper<>();


        //共有部分
        if(StringUtils.isNotBlank(course)){
            queryWrapper.eq("subquery.course_name",course);
        }
        //先选学年再选学期，但可以单独选学期
        if(StringUtils.isNotBlank(academicYear)){
            queryWrapper.eq("grades.academic_year",academicYear);
            if(StringUtils.isNotBlank(semester)){
                queryWrapper.eq("grades.semester",semester);
            }
        }



        //教师端显示页面成绩
        if(StringUtils.isNotBlank(teacher)){
            queryWrapper.eq("subquery.name",teacher);
            //老师的筛选项
            if(StringUtils.isNotBlank(grade)){
                queryWrapper.eq("students.grade",grade);
            }
            //先选专业专业才能选班，但可以单独选专业
            if(StringUtils.isNotBlank(major)){
                queryWrapper.eq("students.major",major);
                if(StringUtils.isNotBlank(studentClass)){
                    queryWrapper.eq("students.studentclass",studentClass);
                }
            }

            if(StringUtils.isNotBlank(name)&&!name.equals("null")){
                queryWrapper.like("students.name",name);
            }
        }     //学生显示成绩
        else if(StringUtils.isNotBlank(name)&&!name.equals("null")){
            queryWrapper.eq("students.name",name);
        }
        IPage<Score> result = scoreService.pageCC(page, queryWrapper);
        System.out.println(result);
        return Result.success(result.getRecords(), result.getTotal());
    }


}
