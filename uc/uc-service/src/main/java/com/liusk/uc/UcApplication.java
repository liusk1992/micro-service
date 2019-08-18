package com.liusk.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 使用feignClient时，如果@feignClient在pom依赖的jar中并且路径与启动类(UcApplication)不在同一个目录下时
 * 是无法加载到@feignClient的类作为spring的Bean
 * 解决办法(1)：将启动类(UcApplication)上提到和feignClient一级，如com.liusk.UcApplication
 *        (2):EnableFeignClients的basePackages添加@feignClient所在的包名
 *
 * @author : liusk
 * @date : 2019/8/6 14:40
 */
@EnableFeignClients(basePackages = {"com.liusk.order.api"})
@EnableDiscoveryClient
@SpringBootApplication
public class UcApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcApplication.class,args);
    }

}
