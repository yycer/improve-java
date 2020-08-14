package com.frankie.demo.aop.importest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Yao Frankie
 * @date: 2020/8/14 09:22
 */
@Configuration(value = "myAppConfig")
@Import({TestBean1.class, TestImportBeanDefinitionRegistrar.class})
public class AppConfig {
}
