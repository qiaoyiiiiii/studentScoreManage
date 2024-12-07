package com.qiaoyi.student.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.qiaoyi.student.Entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMapper extends BaseMapper<Students> {
    @Select("SELECT * FROM students ${ew.customSqlSegment}")
    public IPage<Students> pageCC(IPage page, @Param(Constants.WRAPPER) Wrapper<Students> wrapper);


}
