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
 * @TableName teachers
 */
public class Teachers implements Serializable {

    /**
     * 教师ID
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "教师ID")  // 使用 @Schema 代替 @ApiModelProperty
    @TableId(value = "teacher_id", type = IdType.AUTO)
    private Integer teacher_id;

    /**
     * 姓名
     */
    @NotBlank(message="[]不能为空")
    @Size(max = 50, message="编码长度不能超过50")
    @Schema(description = "教师姓名")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 50, message="编码长度不能超过50")
    private String name;

    /**
     * 年龄
     */
    @Schema(description = "年龄")  // 使用 @Schema 代替 @ApiModelProperty
    private Integer age;

    /**
     * 课程名称
     */
    @Size(max = 100, message="编码长度不能超过100")
    @Schema(description = "课程名称")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 100, message="编码长度不能超过100")
    private String course_name;

    /**
     * 用户ID
     */
    @NotBlank(message="[]不能为空")
    @Size(max = 250, message="编码长度不能超过250")
    @Schema(description = "用户ID")  // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = 250, message="编码长度不能超过250")
    private String user_id;

    /**
     * 是否有效：0无效，1有效
     */
    @Schema(description = "是否有效：0无效，1有效")  // 使用 @Schema 代替 @ApiModelProperty
    private Integer isvalid;

    // Getters and Setters

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public Integer getTeacher_id() {
        return this.teacher_id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getCourse_name() {
        return this.course_name;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public Integer getIsvalid() {
        return this.isvalid;
    }
}
