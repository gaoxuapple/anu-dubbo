package com.anu.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Describe: 服务提供者
 * Author: gao.xu
 * Mail: anhui_gaoxu@126.com
 * Date: 2018年07月10日 9:53
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();


        System.in.read();  // 任意键退出
    }
}
