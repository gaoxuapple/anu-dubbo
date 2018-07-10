package com.anu.dubbo.demo.provider.routine;

import com.anu.dubbo.demo.routine.DemoService;

/**
 * Describe: demoService实现类2
 * Author: gao.xu
 * Mail: anhui_gaoxu@126.com
 * Date: 2018年07月10日 10:22
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
public class DemoServiceImplOne implements DemoService {

    public String sayHello(String name) {
        return name + ", 你好";
    }
}
