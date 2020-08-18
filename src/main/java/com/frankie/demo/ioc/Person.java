package com.frankie.demo.ioc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/18 22:24
 */
@Setter
@Getter
public class Person implements InitializingBean, BeanNameAware, BeanFactoryAware, DisposableBean {

    private String name;

    Person() {
        System.out.println("Constructor of person bean is invoked!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method of person bean is invoked!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName method of person is invoked");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method of person is invoked");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean Destroy method of person bean is invoked!");
    }

    public void init() {
        System.out.println("custom init method of person bean is invoked!");
    }

    public void destroyMethod() {
        System.out.println("custom Destroy method of person bean is invoked!");
    }
}
