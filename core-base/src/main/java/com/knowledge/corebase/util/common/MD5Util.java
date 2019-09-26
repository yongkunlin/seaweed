package com.knowledge.corebase.util.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * module name :
 * Created by lyk on 2019/1/24.
 */
public class MD5Util {

    public static String get32MD5ByStr(String str) {
        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(str.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String temp = Integer.toHexString(number);
                if (temp.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(temp);
            }
            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
