import lab3.MyMath;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyMathTest {
    @Test
    public void firstTest(){
        MyMath test1 = new MyMath();
        assertEquals(97,test1.multi(1,97));
    }

    @Test
    public void secondTest(){
        MyMath test2 = new MyMath();
        assertEquals(970,test2.multi(97,10));
    }
}
