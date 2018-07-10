package com.anu.dubbo.demo.consumer;

import com.anu.dubbo.demo.routine.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Describe:
 * Author: gao.xu
 * Mail: anhui_gaoxu@126.com
 * Date: 2018年07月10日 9:52
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
public class ConsumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.sayHello("gaoxu");
        System.out.println(result);



    }

}
