package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Courses;
import com.qiaoyi.student.Mapper.CoursesMapper;
import com.qiaoyi.student.Service.CoursesService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl extends ServiceImpl<CoursesMapper, Courses> implements CoursesService {
    @Resource
    private CoursesMapper coursesMapper;


}
