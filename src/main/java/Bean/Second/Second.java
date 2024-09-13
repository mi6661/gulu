package Bean.Second;

//第二章bean的配置-通过注解


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Controller;//这就个注释都可以标记bean，只是用途不一样

@Service("second")
public class Second {

    String s = null;
    //一、Spring默认使用无参构造
    public Second(){
        System.out.println("使用了无参构造");
        this.s = "无餐构造";
    }

    //二、用@value注入简单值
    // @Autowrired这个注解是用于标注使用哪个构造方法的。此外，spring默认使用无参构造
    public Second(@Value("${app.message}") String message){
        System.out.println("使用了有参构造");
        this.s = "有参构造："+message;
    }

    public Second(@Value("${app.number}")int number){
        System.out.println("有参构造的整形参数构造成功");
        this.s = number+":Successful";
    }

    //三、根据类型注入依赖

    @Autowired
    public Second(Test test){
        System.out.println("Successful");
        test.Speak();
    }


    //测试的方法
    public void test(){
        System.out.println(s);
    }
}

