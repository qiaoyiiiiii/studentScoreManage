package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Applications;
import com.qiaoyi.student.Entity.Courses;
import com.qiaoyi.student.Mapper.ApplicationMapper;
import com.qiaoyi.student.Service.ApplicationService;
import jakarta.annotation.Resource;
import org.apache.catalina.core.ApplicationMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, Applications> implements ApplicationService {
@Resource
    private ApplicationMapper applicationMapper;

    @Override
    public List<Applications> getAdminAll(String id) {
        return applicationMapper.getAdminAll(id);
    }

    @Override
    public List<Applications> getTeacherAll(String id) {
        return applicationMapper.getTeacherAll(id);
    }

    @Override
    public Integer updateIsValid(String id,Integer admit) {
        return applicationMapper.updateIsValid(id,admit);
    }

}
