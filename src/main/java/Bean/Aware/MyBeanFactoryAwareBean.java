package Bean.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeansException;

@Component("Aware_test_first")
public class MyBeanFactoryAwareBean implements BeanFactoryAware {

    private BeanFactory beanFactory;


    //实现BeanFactoryAware接口的回调方法
    @Override
    public void setBeanFactory(BeanFactory beanFacotry) throws BeansException{
        this.beanFactory = beanFacotry;
    }


    public Object getBean(String beanName){
        return this.beanFactory.getBean(beanName);
    }

}
