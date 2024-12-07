package com.qiaoyi.student.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Entity.Teachers;
import com.qiaoyi.student.Service.StudentService;
import com.qiaoyi.student.Service.TeacherService;
import com.qiaoyi.student.Utils.QueryPageParam;
import com.qiaoyi.student.Utils.Result;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("tea")
public class teacherController {
    @Resource
    private TeacherService teacherService;

    @PostMapping("saveorUpdate")
    public Result saveorUpdate(@RequestBody Teachers teachers) {
        boolean res=teacherService.saveOrUpdate(teachers);
        return res ? Result.success() : Result.fail();
    }


    @PostMapping("/get")
    public Result getStudent(@RequestBody QueryPageParam query) {
        HashMap param = query.getParam();
        String name = (String) param.get("name");
        String course = (String) param.get("course");

        Page<Teachers> page = new Page<>();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());


        LambdaQueryWrapper<Teachers> queryWrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(name)&&!name.equals("null")){
            queryWrapper.like(Teachers::getName,name);
        }
        if(StringUtils.isNotBlank(course)){
            queryWrapper.eq(Teachers::getCourse_name,course);
        }
        IPage<Teachers> result = teacherService.pageCC(page, queryWrapper);
        System.out.println(result);
        System.out.println(result.getRecords());
        return Result.success(result.getRecords(), result.getTotal());
    }

    @GetMapping("/onOrOff")
    public Result confirmApplication(String id,Integer valid) {
        Integer res=teacherService.updateIsValid(id,valid);
        return res==1?Result.success():Result.fail();
    }

    @GetMapping("/change")
    public Result open(Integer valid) {
        System.out.println(valid);
        Integer res=teacherService.change(valid);
        System.out.println(res);
        return res>0?Result.success():Result.fail();
    }
}
