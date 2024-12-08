package com.qiaoyi.student.Entity;

import java.io.Serializable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import io.swagger.v3.oas.annotations.media.Schema; // 添加该 import

/**
 *
 * @TableName menu
 */
public class Menu implements Serializable {

    /**
     *
     */
    @NotNull(message="[]不能为空")
    @Schema(description = "菜单ID") // 使用 @Schema 替代 @ApiModelProperty
    private Integer id;

    /**
     * 菜单编码
     */
    @Size(max= 8, message="编码长度不能超过8")
    @Schema(description = "菜单编码") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 8, message="编码长度不能超过8")
    private String menuCode;

    /**
     * 菜单名字
     */
    @Size(max= 16, message="编码长度不能超过16")
    @Schema(description = "菜单名字") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 16, message="编码长度不能超过16")
    private String menuName;

    /**
     * 点击触发的函数
     */
    @Size(max= 16, message="编码长度不能超过16")
    @Schema(description = "点击触发的函数") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 16, message="编码长度不能超过16")
    private String menuClick;

    /**
     * 权限 0admin, 1表示teacher, 2表示student,可以用逗号组合使用
     */
    @Size(max= 8, message="编码长度不能超过8")
    @Schema(description = "权限 0admin, 1表示teacher, 2表示student,可以用逗号组合使用") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 8, message="编码长度不能超过8")
    private String menuRight;

    /**
     *
     */
    @Size(max= 200, message="编码长度不能超过200")
    @Schema(description = "菜单组件") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 200, message="编码长度不能超过200")
    private String menuComponent;

    /**
     *
     */
    @Size(max= 100, message="编码长度不能超过100")
    @Schema(description = "菜单图标") // 使用 @Schema 替代 @ApiModelProperty
    @Length(max= 100, message="编码长度不能超过100")
    private String menuIcon;

    /**
     *
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * 菜单编码
     */
    public void setMenuCode(String menuCode){
        this.menuCode = menuCode;
    }

    /**
     * 菜单名字
     */
    public void setMenuName(String menuName){
        this.menuName = menuName;
    }

    /**
     * 点击触发的函数
     */
    public void setMenuClick(String menuClick){
        this.menuClick = menuClick;
    }

    /**
     * 权限 0admin, 1表示teacher, 2表示student,可以用逗号组合使用
     */
    public void setMenuRight(String menuRight){
        this.menuRight = menuRight;
    }

    /**
     *
     */
    public void setMenuComponent(String menuComponent){
        this.menuComponent = menuComponent;
    }

    /**
     *
     */
    public void setMenuIcon(String menuIcon){
        this.menuIcon = menuIcon;
    }

    /**
     *
     */
    public Integer getId(){
        return this.id;
    }

    /**
     * 菜单编码
     */
    public String getMenuCode(){
        return this.menuCode;
    }

    /**
     * 菜单名字
     */
    public String getMenuName(){
        return this.menuName;
    }

    /**
     * 点击触发的函数
     */
    public String getMenuClick(){
        return this.menuClick;
    }

    /**
     * 权限 0admin, 1表示teacher, 2表示student,可以用逗号组合使用
     */
    public String getMenuRight(){
        return this.menuRight;
    }

    /**
     *
     */
    public String getMenuComponent(){
        return this.menuComponent;
    }

    /**
     *
     */
    public String getMenuIcon(){
        return this.menuIcon;
    }

}
