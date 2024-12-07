package com.qiaoyi.student.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaoyi.student.Entity.Grades;
import com.qiaoyi.student.Entity.Score;
import com.qiaoyi.student.Entity.Teachers;

import java.io.IOException;
import java.util.List;

public interface ScoreService extends IService<Grades> {

    public IPage pageCC(Page<Score> page, Wrapper<Score> Wrapper);
    public void out(Wrapper<Score> Wrapper) throws IOException;
}
