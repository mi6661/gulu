package Bean.Third.Components;

import org.springframework.context.annotation.Bean;


public class TestFour {
    String name = null;
    int age = 0;
    public TestFour(String name) {
        this.name = name;
    }
    public TestFour(){
        this.name = "TestOne";
    }


    //设置年龄的方法
    public void setAge(int age) {
        this.age = age;
    }

    //输出基本信息
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
