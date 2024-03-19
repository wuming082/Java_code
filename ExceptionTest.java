class ExceptionDrive extends Exception{
    //创建此继承类的构造函数
    //自定义异常类
    public ExceptionDrive()
    {
        super();
    }
    public ExceptionDrive(String input){
        super(input);
    }
}
public class ExceptionTest {
    public static void main(String[] args) {
        int x = 4 ,y = 2;
        try{//用try和catch搭配通过try来接收由inputNum抛出的异常
            inputNum(x, y);
            //并由catach接收并处理
            //从而不会使程序直接终止
        }catch(ExceptionDrive e){
            System.out.println(e.getMessage());
        }
    }
    //创建方法
    public static int inputNum(int x , int y)throws ExceptionDrive
    {
        if(y < 0){
            throw new ExceptionDrive("err");
        }else{
            return x / y;
        }
    }
}

