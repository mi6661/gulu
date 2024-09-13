//1、传统的xml文件注入

package Bean.First;

public class First {

    public First(){
        System.out.println("First:无餐构成");
    }
    public First(String s){
        System.out.println("First:有参构造-"+s);
    }

    //方法
    public void test(){
        System.out.println("this is a test class");
    }
}