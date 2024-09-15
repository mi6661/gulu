package Bean.Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
@Component
public class MyBeanContextAwareBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplictionContext(){
        return applicationContext;
    }

}
