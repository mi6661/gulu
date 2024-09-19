# 学习spring-Iocʕ ᵔᴥᵔ ʔ

## 2024年9月15日
    1、学习了Spring的Bean的Aware接口的应用。在代码中实现了BeanFactoryAware、
    ApplicationContextAware以及EnvironmentAware。其他功能以此类推。
[Spring揭秘：Aware接口应用场景及实现原理！](https://blog.csdn.net/qusikao/article/details/136631127)
    
## 2024年9月16日
    1.学习了spring的监听事件。
        (1)通过接口实现：
            实现ApplicationListener<E>的public void onApplicationEvent(E e)方法；
        (2)同过注解实现：
            @EventListener。定义方法public void onEvent(E e);
        (3)监听事件的优先级：  
            使用注解@Order(n),n=1,2,3,4;数字越小等级越高，越先执行
## 2024年9月17日
    1.学习了spring的生产事件的类

## 2024年9月19日
    1.学习了spring的容器扩张点(在spring容器初始化bean时可以加入自己的逻辑)
        (1)implements BeanPostProcessor
        (2)实现接口方法：
            1)public Object postProcessBeforeInitialization(Object bean,String beanName)
            2)public Object postProcessAfterInitialization(Object bean,String beanName)
            这的作业顾名思义。不过多赘述。
