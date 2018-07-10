package com.anu.dubbo.demo.provider.routine;

import com.anu.dubbo.demo.routine.DemoService;

/**
 * Describe:接口实现
 * Author: gao.xu
 * Mail: anhui_gaoxu@126.com
 * Date: 2018年07月10日 10:21
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
