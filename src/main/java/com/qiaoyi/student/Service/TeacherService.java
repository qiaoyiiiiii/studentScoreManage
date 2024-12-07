package com.qiaoyi.student.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.epam.ta.reportportal.ws.annotations.In;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Entity.Teachers;

public interface TeacherService extends IService<Teachers> {
    IPage<Teachers> pageCC(Page<Teachers> page, Wrapper<Teachers> queryWrapper);

    Integer updateIsValid(String id,Integer isValid);

    Integer change(Integer valid);
}
