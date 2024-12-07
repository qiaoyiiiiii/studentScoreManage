package com.qiaoyi.student.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaoyi.student.Entity.Accounts;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Service.StudentService;
import com.qiaoyi.student.Utils.QueryPageParam;
import com.qiaoyi.student.Utils.Result;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("saveorUpdate")
    public Result saveorUpdate(@RequestBody Students students) {
        boolean res=studentService.saveOrUpdate(students);
        return res ? Result.success() : Result.fail();
    }


    @PostMapping("/get")
    public Result getStudent(@RequestBody QueryPageParam query) {
        HashMap param = query.getParam();
        String name = (String) param.get("name");
        String grade=(String) param.get("grade");
        String major=(String) param.get("major");
        String college=(String) param.get("college");
        String stuClass=(String) param.get("stuClass");

        Page<Students> page = new Page<>();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());


        LambdaQueryWrapper<Students> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Students::getGrade,grade);
        if(StringUtils.isNotBlank(name)&&!name.equals("null")){
            queryWrapper.like(Students::getName,name);
        }
        if(StringUtils.isNotBlank(grade)){
            queryWrapper.eq(Students::getGrade,grade);
        }
        //先选学院才能选专业，不能直接选专业但可直接查看学院，班级同理
        if(StringUtils.isNotBlank(college)){
            queryWrapper.eq(Students::getCollege,college);
            if(StringUtils.isNotBlank(major)){
                queryWrapper.eq(Students::getMajor,major);
            }
            if (StringUtils.isNotBlank(stuClass)){
                queryWrapper.eq(Students::getStudentclass,stuClass);
            }
        }

        IPage<Students> result = studentService.pageCC(page, queryWrapper);
        return Result.success(result.getRecords(), result.getTotal());
    }
}
