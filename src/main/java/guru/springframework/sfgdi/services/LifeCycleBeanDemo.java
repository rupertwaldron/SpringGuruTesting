package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBeanDemo() {
        System.out.println("###In lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("###Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("###My bean name is : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("###Lifecycle has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("###Lifecycle has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("###The application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("###The post construct method has been called.");
    }

    @PreDestroy
    public void postDestroy() {
        System.out.println("###The pre destroy method has been called.");
    }

    public void beforeInit() {
        System.out.println("###Before init called by the Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("###After init called by the Bean Post Processor");
    }

}
