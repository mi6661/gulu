package Bean.Processor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class HelloBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {

        if("hello".equals(beanName)){
            System.out.println("Hello BeanPostProcessor1");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
        if("hell".equals(beanName)){
            System.out.println("Hello BeanPostProcessor2");
        }
        return bean;
    }
}
