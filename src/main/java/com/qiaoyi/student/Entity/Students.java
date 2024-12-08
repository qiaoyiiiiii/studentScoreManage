package com.qiaoyi.student.Entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;  // 使用 OpenAPI 3 的 Schema 注解
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @TableName students
 */
public class Students implements Serializable {

    /**
     * 学生ID
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "学生ID")  // 使用 @Schema 代替 @ApiModelProperty
    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer student_id;

    /**
     * 姓名
     */
    @NotBlank(message="[]不能为空")
    @Size(max = 50, message="编码长度不能超过50")
    @Schema(description = "学生姓名")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message="编码长度不能超过50")
    private String name;

    /**
     * 性别：0男，1女
     */
    @Schema(description = "性别：0男，1女")  // 使用 @Schema 代替 @ApiModelProperty
    private Integer gender;

    /**
     * 年龄
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "年龄")  // 使用 @Schema 代替 @ApiModelProperty
    private Integer age;

    /**
     * 年级
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "年级")  // 使用 @Schema 代替 @ApiModelProperty
    private Integer grade;

    /**
     * 学院
     */
    @Size(max = 50, message="编码长度不能超过50")
    @Schema(description = "学院")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message="编码长度不能超过50")
    private String college;

    /**
     * 专业
     */
    @Size(max = 50, message="编码长度不能超过50")
    @Schema(description = "专业")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message="编码长度不能超过50")
    private String major;

    /**
     * 班级
     */
    @Size(max = 50, message="编码长度不能超过50")
    @Schema(description = "班级")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message="编码长度不能超过50")
    private String studentclass;

    /**
     * 用户ID
     */
    @Size(max = 250, message="编码长度不能超过250")
    @Schema(description = "用户ID")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 250, message="编码长度不能超过250")
    private String user_id;

    // Getters and Setters

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getStudent_id() {
        return this.student_id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public String getCollege() {
        return this.college;
    }

    public String getMajor() {
        return this.major;
    }

    public String getStudentclass() {
        return this.studentclass;
    }

    public String getUser_id() {
        return this.user_id;
    }
}
