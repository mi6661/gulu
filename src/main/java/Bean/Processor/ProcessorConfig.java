package Bean.Processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//容器的拓展点
//需要实现接口BeanPostProcessor


@Configuration
@ComponentScan("Bean.Processor")
public class ProcessorConfig {

    @Bean
    public Hello hello(){
        return new Hello();
    }

    @Bean
    public HelloBeanPostProcessor helloBeanPostProcessor(){
        return new HelloBeanPostProcessor();
    }
}
