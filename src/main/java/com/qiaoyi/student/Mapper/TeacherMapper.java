package com.qiaoyi.student.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.qiaoyi.student.Entity.Students;
import com.qiaoyi.student.Entity.Teachers;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface TeacherMapper extends BaseMapper<Teachers> {
    @Select("SELECT * FROM teachers ${ew.customSqlSegment}")
    public IPage<Teachers> pageCC(IPage page, @Param(Constants.WRAPPER) Wrapper<Teachers> wrapper);

    @Update("UPDATE teachers SET isvalid=${valid} WHERE teacher_id=${id}")
    public int updateIsValid(String id,Integer isvalid);

    @Update("UPDATE teachers SET isvalid=${valid} ")
    public int change(Integer valid);
}
