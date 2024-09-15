package Bean.Aware;


import org.springframework.beans.BeansException;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component

public class MyBeanEnvironmentAware implements EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) throws BeansException {
        this.environment = environment;
    }

    //一个简单的方法，用于输出某个属性值
    public void printProperty(String propertyName){
        String propertyValue = environment.getProperty(propertyName);
        System.out.println("property-"+propertyName+":"+propertyValue);
    }

}
