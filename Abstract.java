import java.nio.ShortBuffer;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;
//当创建了一个抽象接口或者为抽象类时在被继承时，需要重写抽象类内的方法
abstract class animal{
    public abstract void PrintfNam();
}

interface Action{
    public void printTest1();//此为接口内的抽象方法
}
interface move{
    public void pinrtTest2();
}
////////////////////接口继承多个接口//////////////////////////////////////////////
interface interTest1{
    public void interTestFoun1();
}
interface interTest2{
    public void interTestFoun2();
}
interface interTest3 extends interTest1,interTest2{
    public void interTestFoun3();
}
class recive implements interTest3{
    public void interTestFoun1()
    {
        System.out.println();
    }
    public void interTestFoun2(){
        System.out.println();
    }
    public void interTestFoun3()
    {
        System.out.println();
    }
}
////////////////////////////////////////////////////////////////////////////////
class Dog extends animal implements Action,move{
    public void printTest1(){
        System.out.println("hello");
    }
    public void pinrtTest2(){
        System.out.println("world");
    }
    public void PrintfNam(){
        System.out.println("dreamsky");
    }
}
abstract class test10 { 
    abstract void Shout();
}
class A extends test10{
    void Shout()
    {
        System.out.println("hello world");
    }
}
public class Abstract {
    public static void main(String[] args) {
        
    }
}
