package com.shqida.demo.service;

import com.shqida.demo.core.Index;
import com.shqida.demo.inf.IndexService;
import org.springframework.stereotype.Service;

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
@Service
public class IndexServiceImpl implements IndexService {
    private Index index;

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
