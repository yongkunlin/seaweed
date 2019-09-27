package com.knowledge.clientsystem.client;

import com.knowledge.entitysystem.entity.SystemUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "module-system")
public interface SystemUserClient {

    @PostMapping(value = "/systemLogin/login", consumes = "application/json")
    Boolean login(@RequestBody SystemUser systemUser);

}
