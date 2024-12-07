package com.qiaoyi.student.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qiaoyi.student.Entity.Applications;
import com.qiaoyi.student.Service.ApplicationService;
import com.qiaoyi.student.Utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/apl")
public class ApplicationController {
    @Resource
    private ApplicationService applicationService;

    @PostMapping("/up")
    public Result up(@RequestBody Applications application) {
        boolean res=applicationService.save(application);
        return res?Result.success():Result.fail();
    }

    @GetMapping("/cancel")
    public Result cancel(String id) {
        boolean res=applicationService.removeById(id);
        return res?Result.success():Result.fail();
    }

    @GetMapping("/refuse")
    public Result refuse(String id,Integer admit) {
        Integer res=applicationService.updateIsValid(id,admit);
        return res==1?Result.success():Result.fail();
    }

    @GetMapping("/adminiShow")
    public Result showAdmin(String id) {
        List<Applications> lists=applicationService.getAdminAll(id);
        Integer count=lists.size();
        HashMap<String,Object> map=new HashMap<>();
        map.put("list",lists);
        map.put("count",count);
        return !lists.isEmpty()?Result.success(map):Result.fail();
    }

    @GetMapping("/teacherShow")
    public Result showTeacher(String id) {
        List<Applications> lists=applicationService.getTeacherAll(id);
        Integer count=lists.size();
        HashMap<String,Object> map=new HashMap<>();
        map.put("list",lists);
        map.put("count",count);
        return !lists.isEmpty()?Result.success(map):Result.fail();
    }
}
