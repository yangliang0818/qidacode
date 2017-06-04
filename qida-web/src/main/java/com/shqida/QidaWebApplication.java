package com.shqida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
@SpringBootApplication
public class QidaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(QidaWebApplication.class, args);
	}
}
