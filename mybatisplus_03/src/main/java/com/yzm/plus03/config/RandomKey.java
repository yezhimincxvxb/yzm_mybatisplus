package com.yzm.plus03.config;

import com.baomidou.mybatisplus.core.toolkit.AES;

public class RandomKey {

    private static final String url = "jdbc:mysql://192.168.101.129:3306/mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai";
    private static final String username = "root";
    private static final String password = "123456";

    public static void main(String[] args) {
        // 生成秘钥
        String randomKey = AES.generateRandomKey();
        System.out.println("秘钥：" + randomKey);
        // 加密
        System.out.println("加密的url：" + AES.encrypt(url, randomKey));
        System.out.println("加密的username：" + AES.encrypt(username, randomKey));
        System.out.println("加密的password：" + AES.encrypt(password, randomKey));

        //秘钥：3c4fbd0417409088
        /**
         *加密的url：okPilpUF0EXmfWE649Leyyn9JyuEehOXmbPJ1gmXgxaUEMXVeLl+Hdni0M/+jInR15fw9nYNdMEoaMEEalgN/Dpicsrnv464WmpWPFL8a0sV9RHN3hPhapLEtwiBZVxgpJBLLpzMebL59jC5X75td1KFpH8I14xq6NLQ+YXyCt+uGFc/SkJfnskgG9Xh/Z/0REyxDbiMUnk/JzNVWhh8q/jSydYxHx56OZxcmbCI4UrURa6JJAMhJMkPYp2H//Fg
         *加密的username：UHFlRzvX3UX7TTAIDw6zDg==
         *加密的password：9IkA0v5o/lF3rJD8H5taHw==
         */


    }

}
