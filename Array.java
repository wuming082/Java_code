class Test{
    int age;
    void printName()
    {
        System.out.println(age);
    }
}

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];//需要在数组名前加入[]
        arr[0] = 1;
        System.out.println("long" + arr.length);
        Test test1 = new Test();
        Test test2 = null;//非实例化创建对象
        test2 = test1;//将已实例化的test1的空间使用权分配给test2
        test1.age = 10;
        test1.printName();
        test2.age = 18;//
        System.out.println(arr.toString());
        test1.printName();//所以就算修改test2内的变量，本质上还是对于test1对象内的变量进行修改
        //对于所有数组元素初始化都为0 char类型的初始化为空字符 '\u0000'/////////////
    }
}

