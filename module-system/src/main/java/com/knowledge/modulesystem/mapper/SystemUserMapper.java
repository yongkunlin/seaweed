package com.knowledge.modulesystem.mapper;

import com.knowledge.entitysystem.entity.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SystemUserMapper {

    SystemUser getSystemUserByAccount(String account);
}
