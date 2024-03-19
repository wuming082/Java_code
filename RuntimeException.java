import java.io.EOFException;

import javax.swing.event.DocumentEvent.EventType;

public class RuntimeException {
    public static void main(String[] args) {
        try{
            int input = divide(4,0);
            System.out.println(input);
        }
        catch(Exception e){
            e.printStackTrace();
           // System.out.println("错误报告为" + e.getMessage());
        }
        finally{
            System.out.println("执行finally代码块");
        }
        System.out.println("hello");
        try{
            int Num = -1;
            printfAge(Num);
        }
        catch(Exception e){
            System.out.println("错误为" + e.getMessage());
        }
    }
    //创建相除方法
    public static int divide(int x , int y)throws Exception
    {
        return x / y;
    }
    //返回异常的赋值年龄
    public static void printfAge(int Age)throws Exception
    {
        if(Age < 0){
            throw new Exception("错误年龄");
        }
        else{
            System.out.println("年龄" + Age);
        }
    }
}
