package com.liusk.uc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author : liusk
 * @date : 2019/8/8 14:28
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 此处与@Controller @RequestMapping的情况不同，此处直接跳转到index.html,不经过模板跳转
     * 如果想通过模板跳转页面必须引入thymeleaf的jar包，并且加入spring.thymeleaf.prefix=file:D:/XX 配置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        super.addViewControllers(registry);
    }

}
