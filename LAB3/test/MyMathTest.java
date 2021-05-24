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

    @Test
    public void testAssertions(){
        int val1 = 5;
        int val2 = 6;
        assertTrue(val1 < val2);
    }

    @Test
    public void fourthTest(){
        String [] expectedArray = {"one", "two", "three"};
        String [] resultArray = {"one", "two", "three"};
        assertArrayEquals(expectedArray, resultArray);
    }
}
