import java.util.Scanner;
//default 同一包内可见
//private 同一类里可见
//public 对所有类可见 /接口
//protected 对同一包内的所有子类可见
public class function{
    int val;
    public function(int Num){
        val = Num;
        System.out.println("Num = " + val);
    }
    public void functionNum (){
        System.out.println(this.val);
    }
    //方法重载
    public static int add(int x , int y) {
        return x + y;
    }
    public static int add(int x , int y , int z) {
        return x + y + z;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
    int Sum1 = add(1,9);//方法重载
    int Sum2 = add(1,10,49);//方法重载
    double Sum3 = add(1.2,8.1);//方法重载
    System.out.println(Sum3);
    System.out.println(Sum1);
    System.out.println(Sum2);
        
    }
}

/*
         * //Scanner input = new Scanner(System.in);
        //int Num = input.nextInt();
        int Num = 9;
        //创建一个元素容量为10个的字符串
        //StringBuilder类的append方法在元素容量饱和时，会自动扩容空间
        StringBuilder rec = new StringBuilder(10);
        rec.append("hello world");
        System.out.println(rec);
        //后边添加感叹号
        rec.append("!");
        System.out.println(rec);
        //从第8个索引开始插入字符串
        rec.insert(8,"dreamsky0822!!!!!");
        System.out.println(rec);
        //删除5-6索引元素
        rec.delete(5, 6);
        rec.insert(5, "    ");
        System.out.println(rec);
        function test = new function(Num);
        test.functionNum();
         */
        