package AOP;

import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

public class LogHander implements InvocationHandler {
    private Hello source;
    public LogHander(Hello source) {
        this.source = source;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("Ready to say something");
        try{
            return method.invoke(source,args);
        }finally{
            System.out.println("already say something");
        }
    }
}
