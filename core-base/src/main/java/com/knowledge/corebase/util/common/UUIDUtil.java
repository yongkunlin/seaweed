package com.knowledge.corebase.util.common;

import java.util.UUID;

/**
 * uuid工具类
 * Created by yklin on 2018/5/21.
 */
public class UUIDUtil {
    /**
     * 获取32位大写uuid
     *
     * @return
     */
    public static String get32UpperCase() {
        return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
    }
}
