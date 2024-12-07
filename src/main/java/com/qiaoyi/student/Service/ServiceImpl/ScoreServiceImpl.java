package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Grades;
import com.qiaoyi.student.Entity.Score;
import com.qiaoyi.student.Entity.Teachers;
import com.qiaoyi.student.Mapper.ScoreMapper;
import com.qiaoyi.student.Mapper.StudentMapper;
import com.qiaoyi.student.Service.ScoreService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper,Grades> implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    public IPage pageCC(Page<Score> page, Wrapper<Score> Wrapper) {
        return scoreMapper.pageCC(page,Wrapper);
    }

    public void out(Wrapper<Score> Wrapper) throws IOException {
        List<Score> studentGrades = scoreMapper.out(Wrapper);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("学生成绩");

        // Create header row
        Row headerRow = sheet.createRow(0);
        String[] headers = {"学号", "姓名", "性别", "年龄", "年级", "学院", "专业", "班级", "账号", "课程ID", "成绩", "学年", "学期"};
        for (int i = 0; i < headers.length; i++) {
            headerRow.createCell(i).setCellValue(headers[i]);
        }

        // Populate rows with data
        int rowNum = 1;
        for (Score studentGrade : studentGrades) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(1).setCellValue(studentGrade.getName());
            row.createCell(2).setCellValue(studentGrade.getTeacher());
            row.createCell(4).setCellValue(studentGrade.getGrade());
            row.createCell(5).setCellValue(studentGrade.getCollege());
            row.createCell(6).setCellValue(studentGrade.getMajor());
            row.createCell(7).setCellValue(studentGrade.getStudentclass());
            row.createCell(9).setCellValue(studentGrade.getCourse_name());
            row.createCell(10).setCellValue(studentGrade.getScore().doubleValue());
            row.createCell(11).setCellValue(studentGrade.getAcademic_year());
            row.createCell(12).setCellValue(studentGrade.getSemester());
        }

        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream("student_grades.xlsx")) {
            workbook.write(fileOut);
        }

        workbook.close();
    }


}
