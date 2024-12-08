package com.qiaoyi.student.Entity;

import java.io.Serializable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import io.swagger.v3.oas.annotations.media.Schema; // 添加此 import

/**
 *
 * @TableName accounts
 */
public class Accounts implements Serializable {

    /**
     *
     */
    @NotBlank(message="[]不能为空")
    @Size(max= 255, message="编码长度不能超过255")
    @Schema(description = "用户ID") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 255, message="编码长度不能超过255")
    private String user_id;

    /**
     *
     */
    @NotBlank(message="[]不能为空")
    @Size(max= 100, message="编码长度不能超过100")
    @Schema(description = "密码") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 100, message="编码长度不能超过100")
    private String password;

    /**
     * 0学生，1教师，2管理员
     */
    @NotNull(message="[0学生，1教师，2管理员]不能为空")
    @Schema(description = "角色: 0学生，1教师，2管理员") // 使用 @Schema 替代 @ApiModelProperty
    private Integer role;

    /**
     *
     */
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    /**
     *
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * 0学生，1教师，2管理员
     */
    public void setRole(Integer role){
        this.role = role;
    }

    /**
     *
     */
    public String getUser_id(){
        return this.user_id;
    }

    /**
     *
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * 0学生，1教师，2管理员
     */
    public Integer getRole(){
        return this.role;
    }
}
