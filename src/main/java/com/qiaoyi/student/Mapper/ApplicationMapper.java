package com.qiaoyi.student.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiaoyi.student.Entity.Applications;
import com.qiaoyi.student.Entity.Courses;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface ApplicationMapper extends BaseMapper<Applications> {

    @Select("SELECT * FROM applications WHERE isvalid=1 AND receptid=id")
    List<Applications> getAdminAll(String id);

    @Select("SELECT * FROM applications WHERE isvalid=1 AND applicantid=id")
    List<Applications> getTeacherAll(String id);

    @Update("UPDATE applications SET isvalid=1 AND admit=${admit} WHERE applicantid=${id}")
    public int updateIsValid(String id,Integer admit);
}
