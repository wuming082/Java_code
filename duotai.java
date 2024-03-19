import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;


class animal{
    public String toString()
    {
        return "这是一个动物";
    }
    public void shout(){
        System.out.println("hello");
    }
    public void testfounction(){
        testfounction1();
    }
    public void testfounction1()
    {
        class Aanimal{
            int M = 1;
        }
        Aanimal transfer = new Aanimal();
        System.out.println("M" + transfer.M);
    }
}
class dog extends animal{
    public void shout(){
        System.out.println("world");
    }
    public void eat(){
        System.out.println("eat");
    }
}
public class duotai {
    public static void main(String[] args) {
        dog Dog = new dog();
        animal an = Dog;
        an.shout();
        animal newAn = new animal();
        newAn.shout();
        an.testfounction1();

    }
}
