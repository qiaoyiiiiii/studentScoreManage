package com.qiaoyi.student.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema; // 添加对 Schema 的引入
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @TableName grades
 */
public class Grades implements Serializable {

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "成绩ID")  // 使用 @Schema 替代 @ApiModelProperty
    @TableId(value = "grade_id", type = IdType.AUTO)
    private Integer grade_id;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "学生ID") // 使用 @Schema 替代 @ApiModelProperty
    private Integer student_id;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "教学ID") // 使用 @Schema 替代 @ApiModelProperty
    private Integer teaching_id;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "成绩") // 使用 @Schema 替代 @ApiModelProperty
    private BigDecimal score;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Size(max = 20, message = "编码长度不能超过20")
    @Schema(description = "学年") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max = 20, message = "编码长度不能超过20")
    private String academic_year;

    /**
     * 0春季，1秋季
     */
    @Schema(description = "学期 0春季，1秋季") // 使用 @Schema 替代 @ApiModelProperty
    private Integer semester;

    // 添加默认构造函数
    public Grades() {
    }

    public Grades(Integer gradeId, Integer studentId, Integer teachingId, Integer semesterId, BigDecimal score, String academic_year) {
        this.grade_id = gradeId;
        this.student_id = studentId;
        this.teaching_id = teachingId;
        this.semester = semesterId;
        this.academic_year = academic_year;
        this.score = score;
    }

    /**
     *
     */
    public void setGrade_id(Integer grade_id) {
        this.grade_id = grade_id;
    }

    /**
     *
     */
    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    /**
     *
     */
    public void setTeaching_id(Integer teaching_id) {
        this.teaching_id = teaching_id;
    }

    /**
     *
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     *
     */
    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    /**
     * 0春季，1秋季
     */
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     *
     */
    public Integer getGrade_id() {
        return this.grade_id;
    }

    /**
     *
     */
    public Integer getStudent_id() {
        return this.student_id;
    }

    /**
     *
     */
    public Integer getTeaching_id() {
        return this.teaching_id;
    }

    /**
     *
     */
    public BigDecimal getScore() {
        return this.score;
    }

    /**
     *
     */
    public String getAcademic_year() {
        return this.academic_year;
    }

    /**
     * 0春季，1秋季
     */
    public Integer getSemester() {
        return this.semester;
    }

}
