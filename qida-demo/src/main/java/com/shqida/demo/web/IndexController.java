package com.shqida.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C), 2012-2022 上海骑达科技 版权所有
 * @Website www.shqida.com
 * @Author: Created by YangLiang
 * @Date: 2017/6/4
 * @Version: 1.0.0
 * @Description:
 * @History: 变更记录
 * <author>           <time>             <version>        <desc>
 * YangLiang          2017/6/4            00000001         创建文件
 */
@RestController
public class IndexController {
    @GetMapping(value = "/index")
    public String index() {
        return "hello world";
    }
}
