package Bean.Third.Components;

public class TestOne {
    String name = null;
    int age = 0;
    public TestOne(String name) {
        this.name = name;
    }
    public TestOne(){
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
