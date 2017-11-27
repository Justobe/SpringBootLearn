package com.springboot.yanming.mybatisconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.springboot.yanming.mybatisconfig.mapper")
@SpringBootApplication
public class MybatisconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisconfigApplication.class, args);
	}
}
