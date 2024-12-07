package com.qiaoyi.student.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaoyi.student.Entity.Applications;
import com.qiaoyi.student.Entity.Courses;

import java.util.List;

public interface ApplicationService extends IService<Applications> {
    public List<Applications> getAdminAll(String id);
    public List<Applications> getTeacherAll(String id);
    Integer updateIsValid(String id,Integer admit);
}
