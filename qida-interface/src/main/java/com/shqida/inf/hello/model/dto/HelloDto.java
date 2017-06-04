package com.shqida.inf.hello.model.dto;

import com.shqida.inf.hello.model.entity.THello;

/**
 * @Copyright (C), 2012-2022 上海骑达科技 版权所有
 * @Websit www.shqida.com
 * @Author: Created by YangLiang
 * @Date: 2017/6/4
 * @Version: 1.0.0
 * @Description:
 * @History: 变更记录
 * <author>           <time>             <version>        <desc>
 * YangLiang          2017/6/4            00000001         创建文件
 */
public class HelloDto {
    private THello tHello=new THello();

    public String getRemark() {
        return tHello.getRemark();
    }

    public void setRemark(String remark) {
        tHello.setRemark(remark);
    }

    public THello gettHello() {
        return tHello;
    }
}
