package Bean.Second;

//第二章bean的配置-通过注解


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Controller;//这就个注释都可以标记bean，只是用途不一样

@Controller("second")
public class Second {
    public Second(){
        System.out.println("使用了无参构造");
    }

    @Autowired
    public Second(String s){
        System.out.println("使用了有参构造："+s);
    }

    public void test(){
        System.out.println("this is test");
    }
}

