package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Entity.Teachers;
import com.qiaoyi.student.Mapper.TeacherMapper;
import com.qiaoyi.student.Service.TeacherService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teachers> implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;


    @Override
    public IPage pageCC(Page<Teachers> page, Wrapper<Teachers> Wrapper) {
        return teacherMapper.pageCC(page,Wrapper);
    }

    @Override
    public Integer updateIsValid(String id,Integer Valid) {
        return teacherMapper.updateIsValid(id,Valid);
    }

    public Integer change(Integer valid){
        return teacherMapper.change(valid);
    }


}
