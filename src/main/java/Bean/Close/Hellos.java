package Bean.Close;

//如何优雅地关闭容器
//说人话就是在容器关闭时执行一些操作

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;


@Component
public class Hellos implements Lifecycle {


    private boolean flag = false;

    public String hello(){
        return flag? "hello world":"Bye!";
    }

    @Override
    public boolean isRunning() {
        return flag;
    }

    @Override
    public void stop() {
        System.out.println("stop");
        flag = false;
    }

    @Override
    public void start() {
        System.out.println("start");
        flag = true;
    }

}
