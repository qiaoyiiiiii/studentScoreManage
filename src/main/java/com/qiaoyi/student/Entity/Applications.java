package com.qiaoyi.student.Entity;


import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema; // 使用 OpenAPI 3 的 Schema 注解
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @TableName applications
 */
public class Applications implements Serializable {

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "申请ID") // 使用 @Schema 代替 @ApiModelProperty
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "申请人ID") // 使用 @Schema 代替 @ApiModelProperty
    private Integer applicantid;

    /**
     *
     */
    @NotBlank(message="[]不能为空")
    @Size(max = -1, message = "编码长度不能超过-1") // 请根据实际需求调整max值
    @Schema(description = "申请信息") // 使用 @Schema 代替 @ApiModelProperty
    @Length(max = -1, message = "编码长度不能超过-1") // 请根据实际需求调整max值
    private String application_info;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "接收人ID") // 使用 @Schema 代替 @ApiModelProperty
    private Integer receptid;

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "申请时间") // 使用 @Schema 代替 @ApiModelProperty
    private Date application_time;

    /**
     * 0无效，1有效
     */
    @Schema(description = "是否有效：0 无效，1 有效") // 使用 @Schema 代替 @ApiModelProperty
    private Integer isvalid;

    @Schema(description = "管理员标识：0 无效，1 有效") // 使用 @Schema 代替 @ApiModelProperty
    private Integer admin;

    // Getters and Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setApplicantid(Integer applicantid) {
        this.applicantid = applicantid;
    }

    public void setApplication_info(String application_info) {
        this.application_info = application_info;
    }

    public void setReceptid(Integer receptid) {
        this.receptid = receptid;
    }

    public void setApplication_time(Date application_time) {
        this.application_time = application_time;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getApplicantid() {
        return this.applicantid;
    }

    public String getApplication_info() {
        return this.application_info;
    }

    public Integer getReceptid() {
        return this.receptid;
    }

    public Date getApplication_time() {
        return this.application_time;
    }

    public Integer getIsvalid() {
        return this.isvalid;
    }

    public Integer getAdmin() {
        return this.admin;
    }

}
