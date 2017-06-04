package com.shqida.service.hello;

import com.shqida.inf.hello.HelloService;
import com.shqida.inf.hello.dao.HelloDao;
import com.shqida.inf.hello.model.dto.HelloDto;
import com.shqida.inf.hello.model.entity.THello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

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
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;

    @Override
    public THello add(HelloDto helloDto) {
        THello tHello = helloDto.gettHello();
        tHello.setCreater(-1l);
        tHello.setModifier(-1l);
        tHello.setModifyTime(new Timestamp(System.currentTimeMillis()));
        helloDao.save(tHello);
        return tHello;
    }

}
