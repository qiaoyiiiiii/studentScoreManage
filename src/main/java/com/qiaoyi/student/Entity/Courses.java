package com.qiaoyi.student.Entity;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema; // 使用 OpenAPI 3 的 Schema 注解
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @TableName courses
 */
public class Courses implements Serializable {

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "课程ID") // 使用 @Schema 代替 @ApiModelProperty
    private Integer course_id;

    /**
     *
     */
    @NotBlank(message="[]不能为空")
    @Size(max = 100, message = "编码长度不能超过100")
    @Schema(description = "课程名称") // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 100, message = "编码长度不能超过100")
    private String course_name;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "学分") // 使用 @Schema 代替 @ApiModelProperty
    private Integer credits;

    /**
     * 0必修，1选修
     */
    @Schema(description = "课程类型：0 必修，1 选修") // 使用 @Schema 代替 @ApiModelProperty
    private Integer course_type;

    /**
     *
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @Schema(description = "所属院系") // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message = "编码长度不能超过50")
    private String department;

    /**
     *
     */
    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    /**
     *
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     *
     */
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * 0必修，1选修
     */
    public void setCourse_type(Integer course_type) {
        this.course_type = course_type;
    }

    /**
     *
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     *
     */
    public Integer getCourse_id() {
        return this.course_id;
    }

    /**
     *
     */
    public String getCourse_name() {
        return this.course_name;
    }

    /**
     *
     */
    public Integer getCredits() {
        return this.credits;
    }

    /**
     * 0必修，1选修
     */
    public Integer getCourse_type() {
        return this.course_type;
    }

    /**
     *
     */
    public String getDepartment() {
        return this.department;
    }

}
