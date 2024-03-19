import java.util.jar.Attributes.Name;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

class stduent{
    //创建私有变量/////////////////
    private int age;
    private String name;
    //构造方法
   
    //静态代码构造块，只会执行一次优先级最高
    static{
        System.out.println("此为静态代码块");
    }
    {
        System.out.println("此为构造代码块");
    }
    public stduent()
    {
        System.out.println("此为无参数构造方法");
    }
    //访问变量方法
    void changeAge(int Num)
    {
        if(Num <= 0){
            System.out.println("err");
            return;
        }else{
            this.age = Num;
        }
    }
    void changeName(String Name)
    {
        this.name = Name;
    }
    //读取变量方法
    int GetAge()
    {
        return this.age;
    }
    void say()
    {
        System.out.println("hello world");
    }

}
public class classprivate {
    public static void main(String[] args) {
        stduent test = new stduent();
        stduent test1 = new stduent();
        test1 = null;
        test1.say();
        
    }
}
