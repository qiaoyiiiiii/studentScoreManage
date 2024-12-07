package com.qiaoyi.student.Controller;

import com.qiaoyi.student.Entity.Courses;
import com.qiaoyi.student.Service.CoursesService;
import com.qiaoyi.student.Utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CoursesController {
    @Resource
    private CoursesService coursesService;

    @GetMapping("get")
    public Result get(String department){
        List<Courses> list=coursesService.lambdaQuery().eq(Courses::getDepartment,department).list();
        return !list.isEmpty() ?Result.success(list):Result.fail();
    }
}
