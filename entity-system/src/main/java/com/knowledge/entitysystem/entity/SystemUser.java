package com.knowledge.entitysystem.entity;

import com.knowledge.corebase.entity.CoreEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Data
@Entity
@Table(
        name = "system_user",
        indexes = {
                @Index(columnList = "name"),
                @Index(columnList = "create_date"), @Index(columnList = "create_user"),
                @Index(columnList = "update_date"), @Index(columnList = "update_user")
        }
)
public class SystemUser extends CoreEntity {
    @Column(name = "user_code", unique = true, nullable = false, length = 32)
    private String userCode;

    /**
     * 部门code
     */
    @Column(name = "org_code", nullable = false, length = 64)
    private String orgCode;

    /**
     * 姓名
     */
    @Column(name = "name", nullable = false, length = 32)
    private String name;

    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    @Column(name = "account", unique = true, nullable = false, length = 32)
    private String account;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Column(name = "password", nullable = false, length = 32)
    private String password;


    /**
     * 状态
     */
    @Column(name = "status", nullable = false, length = 2)
    private Integer status;

}
