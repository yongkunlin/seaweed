package com.knowledge.corebase.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 冗余字段
 */
@Data
//标识的类表示其不能映射到数据库表，因为其不是一个完整的实体类，但是它所拥有的属性能够隐射在其子类对用的数据库表中
@MappedSuperclass
//是将父类和其所有的子类集合在一块，存在一张表中，并创建一个新的字段来判断对象的类型。
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class CoreEntity implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private String id;

    /**
     * 创建人
     */
    @Column(name = "create_user", nullable = false, length = 32, updatable = false)
    private String createUser;

    /**
     * 创建日期
     */
    @Column(name = "create_date", nullable = false, columnDefinition = "DATE", updatable = false)
    private Date createDate;

    /**
     * 修改人
     */
    @Column(name = "update_user", nullable = true, length = 32)
    private String updateUser;

    /**
     * 修改日期
     */
    @Column(name = "update_date", nullable = true, columnDefinition = "DATE")
    private Date updateDate;

    /**
     * 版本
     */
    @Column(name = "version", nullable = false, length = 9)
    private Integer version;
}
