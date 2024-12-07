package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Mapper.StudentMapper;
import com.qiaoyi.student.Service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Students> implements StudentService{
    @Resource
    public StudentMapper studentMapper;

    @Override
    public IPage pageCC(Page<Students> page, Wrapper<Students> Wrapper) {
        return studentMapper.pageCC(page,Wrapper);
    }
}
