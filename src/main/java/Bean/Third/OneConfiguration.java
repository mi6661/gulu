package Bean.Third;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import Bean.Third.Components.*;
@Configuration    //Configuration用于标记配置类
//@ComponentScan("Bean.Third.Components")//在配置类中配置需要自动扫描的包
public class OneConfiguration {

    //在配置类中配置Bean
    @Bean("testOne") //这个相当于xml中的<bean id="testOne"/>
    public TestOne getTestOne(){
        TestOne testOne = new TestOne("zhangsan");
        testOne.setAge(12);
        return testOne;
    }
    @Bean
    public TestSecond getTestSecond(){
        TestSecond testSecond = new TestSecond("lisi");
        testSecond.setAge(15);
        return testSecond;
    }
    @Bean
    public TestThird getTestThird(){
        TestThird testThird = new TestThird("wangwu");
        testThird.setAge(20);
        return testThird;
    }

}
