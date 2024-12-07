package com.qiaoyi.student.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaoyi.student.Entity.Students;


public interface StudentService extends IService<Students> {
    IPage<Students> pageCC(Page<Students> page, Wrapper<Students> queryWrapper);
}
