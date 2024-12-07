package com.qiaoyi.student.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiaoyi.student.Entity.Courses;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CoursesMapper extends BaseMapper<Courses> {


}
